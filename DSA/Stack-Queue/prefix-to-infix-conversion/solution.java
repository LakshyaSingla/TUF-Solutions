class Solution {
    public String prefixToInfix(String s) {
        // Your code goes here
        int n = s.length();
        Stack<String> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String c1 = st.pop();
                String c2 = st.pop();
                String ex = "(" + c1 + c + c2 + ")";
                st.push(ex);
            }
        }
        return st.peek();
    }
}