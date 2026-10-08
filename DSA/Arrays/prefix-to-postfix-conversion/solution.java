class Solution {
    public String prefixToPostfix(String s) {
        // Your code goes here
        int n = s.length();
        Stack<String> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                st.push(String.valueOf(c));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = op1 + op2 + c;
                st.push(exp);
            }
        }
        return st.peek();
    }
}
