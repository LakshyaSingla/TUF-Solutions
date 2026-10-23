class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // Your code goes here
        return count(nums, k) - count(nums, k - 1);
    }
    int count(int[] nums, int k){
        Map<Integer, Integer> mpp = new HashMap<>();
        int l = 0, r = 0, n = nums.length, sum = 0;
        while(r < n){
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);
            if(mpp.get(nums[r]) == 1){
                k--;
            }
            while(k < 0){
                mpp.put(nums[l], mpp.get(nums[l]) - 1);
                if(mpp.get(nums[l]) == 0){
                    k++;
                }
                l++;
            }
            sum += r - l + 1;
            r++;
        }
        return sum;
    }
}