class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if(st.isEmpty()){
            min = val;
            st.push(val);
            return;
        }

        if(val > min){
            st.push(val);
        }else{
            st.push(2 * val - min);
            min = val;
        }
    }

    public void pop() {
        if(st.isEmpty()) return;
        int x = st.pop();
        if(x < min){
            min = 2 * min - x;
        }
    }

    public int top() {
        if(st.isEmpty()) return -1;
        int x = st.peek();
        if(x > min) return x;
        return min;
    }

    public int getMin() {
        return min;
    }
}