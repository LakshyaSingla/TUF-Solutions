class Solution {
    public int summation(int[] nums, int limit){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.ceil((double) nums[i] / (double) limit);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;
       
       if(n > limit) return -1;

       int maxi = Integer.MIN_VALUE;
       for(int num : nums){
        maxi = Math.max(maxi, num);
       }
       int low = 1, high = maxi;

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