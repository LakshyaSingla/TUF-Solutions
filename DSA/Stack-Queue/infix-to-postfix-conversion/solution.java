class Solution {
    int precedence(char ch){
            if(ch == '+' || ch == '-') return 1;
            if(ch == '*' || ch == '/') return 2;
            if(ch == '^') return 3;
            return 0;
        }
        boolean isOperator(char ch){
            return ch == '+' ||ch == '-' ||ch == '*' ||ch == '/' ||ch == '^';
        }
        boolean isRightAssociative(char ch){
            return ch == '^';
        }
    public String infixToPostfix(String s) {
        // Your code goes here
        
        
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop();
            }else if(isOperator(ch)){
                while(!st.isEmpty() && st.peek()!= '(' &&
                (precedence(st.peek()) > precedence(ch) ||
                    (precedence(st.peek()) == precedence(ch) && !isRightAssociative(ch))
                    )
                ){
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
}