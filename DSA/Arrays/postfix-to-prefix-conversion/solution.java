class Solution {
    public String postToPre(String postfix) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for(char ch : postfix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String c1 = st.pop();
                String c2 = st.pop();
                String exp = ch + c2 + c1;
                st.push(exp);
            }

        }
        return st.peek();
    }
}