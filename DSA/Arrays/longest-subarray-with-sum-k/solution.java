class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n = nums.length;
       HashMap<Integer, Integer> mpp = new HashMap<>();
       int sum = 0;
       int maxLen = 0;

       for(int i = 0; i < n; i++){
        sum+= nums[i];

        if(sum == k){
            maxLen = Math.max(maxLen, i + 1);
        }
        int rem = sum - k;

        if(mpp.containsKey(rem)){
            int len = i - mpp.get(rem);
            maxLen = Math.max(len, maxLen);
        }

        if(!mpp.containsKey(sum)){
            mpp.put(sum, i);
        }
       }
       return maxLen;
    }
}