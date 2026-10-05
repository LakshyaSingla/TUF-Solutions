class Solution {
    int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        return 0;
    }
    public String infixToPrefix(String s) {
        // Your code goes here
        String str = new StringBuilder(s).reverse().toString();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                arr[i] = ')';
            }else if(arr[i] == ')'){
                arr[i] = '(';
            }
        }
        str = new String(arr);
        
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                ans.append(c);
            }else if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && st.peek() != '(' && precedence(st.peek()) > precedence(c)){
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}