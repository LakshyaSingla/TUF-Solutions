class Solution {
    public String postToInfix(String postExp) {
        // Your code goes here
        int n = postExp.length();
        Stack<String> st = new Stack<>();

        for(int i = 0; i < n; i++){
            char c = postExp.charAt(i);
            if(Character.isLetter(c)){
                st.push(String.valueOf(c));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = "(" + op2 + c + op1 + ")";
                st.push(exp);
            }
        }
        return st.peek();
    }
}
