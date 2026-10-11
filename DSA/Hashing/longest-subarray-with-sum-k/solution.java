class Solution {
    public int longestSubarray(int[] nums, int k) {
       int max = 0;
       int sum = 0;
       int n = nums.length;
       Map<Integer, Integer> mpp = new HashMap<>();
       for(int i = 0; i < n; i++){
        sum += nums[i];
        if(sum == k){
            max = Math.max(max, i + 1);
        }
        int rem = sum - k;
        if(mpp.containsKey(rem)){
            int len = i - mpp.get(rem);
            max = Math.max(len, max);
        }
        if(!mpp.containsKey(sum)) mpp.put(sum, i);
       }
       return max;
    }
}