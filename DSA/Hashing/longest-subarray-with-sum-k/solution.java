class Solution {
    public int longestSubarray(int[] nums, int k) {
       int sum = 0, maxlen = 0;
       int n = nums.length;
       Map<Integer, Integer> mpp = new HashMap<>();
       for(int i = 0; i < n; i++){
        sum += nums[i];
        if(sum == k) maxlen = i + 1;
        int comp = sum - k;
        if(mpp.containsKey(comp)){
            int len = i - mpp.get(comp);
            maxlen = Math.max(len, maxlen);
        }
        if(!mpp.containsKey(sum)){
            mpp.put(sum, i);
        }
       }
       return maxlen;
    }
}