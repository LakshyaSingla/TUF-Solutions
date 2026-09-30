class Solution {
    public int[] nextSmallerElements(int[] arr) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = n - 1;i >= 0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(arr[i]);
        }
        return ans;
    }
}