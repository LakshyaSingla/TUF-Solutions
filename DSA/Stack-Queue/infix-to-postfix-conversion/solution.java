class Solution {
    int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c =='*' || c=='/') return 2;
        if(c == '^') return 3;
        return 0;
    }
    boolean isRightAssociative(char c){
        return c == '^';
    }
    boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    public String infixToPostfix(String s) {
        // Your code goes here
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }else if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop();
            }else if(isOperator(c)){
                while(!st.isEmpty() && st.peek() != '(' &&
                    (precedence(st.peek()) > precedence(c) || 
                        (precedence(st.peek()) == precedence(c) && !isRightAssociative(c) ))
                    ){
                        result.append(st.pop());
                    }
            
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
}