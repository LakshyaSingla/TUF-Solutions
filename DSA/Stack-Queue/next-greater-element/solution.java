class Solution {
    public int[] nextLargerElement(int[] arr) {
     Stack<Integer> st = new Stack<>();
     int n = arr.length;
     int[] ans = new int[n];
     for(int i = n - 1; i >= 0; i--){
        
        while(!st.isEmpty() && arr[i] >= st.peek()){
            st.pop();
        }
        if(!st.isEmpty())ans[i] = st.peek();
        else ans[i] = -1; 
        st.push(arr[i]);
     }
     return ans;
    }
}