class Solution {
    int totalHours(int[] nums, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double) nums[i] / (double) mid);
        }
        return sum;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int n = nums.length;

        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            maxi = Math.max(maxi, num);
        }

        int low = 1, high = maxi;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(totalHours(nums, mid) <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}