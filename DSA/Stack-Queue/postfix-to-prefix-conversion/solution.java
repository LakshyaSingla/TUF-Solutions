class Solution {
    public String postToPre(String postfix) {
        // Your code goes here
        int n = postfix.length();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = postfix.charAt(i);
            if(Character.isLetter(c)){
                st.push(String.valueOf(c));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = c + op2 + op1;
                st.push(exp);
            }
        }
        return st.peek();
    }
}