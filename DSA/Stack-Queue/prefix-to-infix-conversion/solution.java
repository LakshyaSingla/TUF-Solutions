class Solution {
    public String prefixToInfix(String s) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        int n = s.length();

        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                st.push(String.valueOf(c));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = "(" + op1 + c + op2 + ")";
                st.push(exp);
            }
        }
        return st.peek();
    }
}