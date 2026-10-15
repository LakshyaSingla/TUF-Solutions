class Solution {
    int summation(int[] nums, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double) nums[i] / (double) mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;
       int max = Integer.MIN_VALUE;
       int low = 1;
       for(int num : nums){
        max = Math.max(max, num);
       }
       int high = max;
       while(low <= high){
        int mid = low + (high - low) / 2;
        if(summation(nums, mid) <= limit){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
       }
       return low;
    }
}