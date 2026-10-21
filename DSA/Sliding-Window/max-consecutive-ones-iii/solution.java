class Solution {
    public int longestOnes(int[] nums, int k) {
        //your code goes here
        int n = nums.length;
        int l = 0, r = 0, max = 0, zero = 0;
        while(r < n){
            if(nums[r] == 0) zero++;
            if(zero > k){
                if(nums[l] == 0) zero--;
                l++;
            }
            if(zero <= k){
                int len = r - l + 1;
                max = Math.max(max, len);
            }
            r++;
        }
        return max;
    }
}