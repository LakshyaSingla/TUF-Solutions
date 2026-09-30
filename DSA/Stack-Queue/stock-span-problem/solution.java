class Solution {
    int[] PGE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(i);
        }
        return ans;
    }
    public int[] stockSpan(int[] arr, int n) {
     int[] PGE = PGE(arr);
    int[] ans = new int[n];
     for(int i = 0; i < n; i++){
        ans[i] = i - PGE[i];
     }
     return ans;
    }
}

