class Solution {
    int summation(int[] nums, int mid){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.ceil((double) nums[i] / (double) mid);
        }
        return sum;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int low = 1;
        int max = -1;
        for(int num : nums){
            max = Math.max(num, max);
        }
        int high = max;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(summation(nums, mid) <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}