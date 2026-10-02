class Solution {
    public String postToInfix(String postExp) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for(char c : postExp.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String c1 = st.pop();
                String c2 = st.pop();
                String exp = "(" + c2 + c + c1 + ")";
                st.push(exp);
            }
        }
        return st.peek();
    }
}
