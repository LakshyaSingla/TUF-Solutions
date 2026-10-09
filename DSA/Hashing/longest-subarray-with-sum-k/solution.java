class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n = nums.length;
       Map<Integer, Integer> mpp = new HashMap<>();
       int sum = 0, maxlen = 0;
       for(int i = 0; i < n; i++){
        sum += nums[i];
        if(sum == k){
            maxlen = Math.max(maxlen, i + 1);
        }

        int rem = sum - k;
        if(mpp.containsKey(rem)){
            int len = i - mpp.get(rem);
            maxlen = Math.max(len, maxlen);
        }

        if(!mpp.containsKey(sum)){
            mpp.put(sum, i);
        }
       }
       return maxlen;
    }
}