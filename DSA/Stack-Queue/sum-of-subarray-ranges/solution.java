class Solution {
    int[] findNSE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = n;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] findNGE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = n;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] findPSE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] findPGE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    long subarrayMin(int[] nums){
        int n =nums.length;
        int[] PSE = findPSE(nums);
        int[] NSE = findNSE(nums);
        long sum = 0;
        for(int i = 0; i < n; i++){
            int left = i - PSE[i];
            int right = NSE[i] - i;
            long freq = left * right * 1L;
            long val = freq* nums[i] * 1L;
            sum += val; 
        }
        return sum;
    }
    long subarrayMax(int[] nums){
        int n =nums.length;
        int[] PGE = findPGE(nums);
        int[] NGE = findNGE(nums);
        long sum = 0;
        for(int i = 0; i < n; i++){
            int left = i - PGE[i];
            int right = NGE[i] - i;
            long freq = left * right * 1L;
            long val = freq * nums[i] * 1L;
            sum += val; 
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return subarrayMax(nums) - subarrayMin(nums);
    }
}