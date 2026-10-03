class Solution {
    int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return 0;
    }
    boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    boolean isRightAss(char c){
        return c == '^';
    }
    public String infixToPostfix(String s) {
        // Your code goes here
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }else if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }else if(isOperator(c)){
                while(!st.isEmpty() && st.peek() != '(' && 
                    (precedence(st.peek()) > precedence(c) || (
                        precedence(st.peek()) == precedence(c) && !isRightAss(c) 
                    )
                    )
                ){
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}