class Solution {
    int precedence(char c){
        if(c == '+' || c =='-') return 1;
        if(c == '*' || c == '/') return 2;
        return 0;
    }

    public String infixToPrefix(String s) {
        // Your code goes here
        String str = new StringBuilder(s).reverse().toString();
        char[] arr = str.toCharArray();
      for (int i = 0; i < arr.length; i++) {
    if (arr[i] == '(') {
        arr[i] = ')';
    } else if (arr[i] == ')') {
        arr[i] = '(';
    }
}
        str = new String(arr);
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
               res.append(ch);     
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && st.peek() != '(' && precedence(st.peek()) > precedence(ch)){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }

        return res.reverse().toString();

    }
}