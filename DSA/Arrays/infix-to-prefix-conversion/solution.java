class Solution {
    int precedence(char d){
        if(d == '+' || d == '-') return 1;
        if(d == '*' || d == '/') return 2;
        return 0;
    }
    public String infixToPrefix(String s) {
        // Your code goes here
        String str = new StringBuilder(s).reverse().toString();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '('){
                ch[i] = ')';
            }else if(ch[i] == ')'){
                ch[i] = '(';
            }
        }
        str = new String(ch);
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                res.append(c);
            }else if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && precedence(st.peek()) > precedence(c)){
                    res.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}