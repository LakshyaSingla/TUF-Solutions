class Solution {
    public String prefixToPostfix(String s) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String c1 = st.pop();
                String c2 = st.pop();
                String exp = c1 + c2 + c;
                st.push(exp);
            }
        }
        return st.peek();
    }
}
