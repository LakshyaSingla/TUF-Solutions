class Solution {
    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secmax = max;
                max = nums[i];
                
            }else if(nums[i] > secmax && nums[i] < max){
                secmax = nums[i];
            }
        }
        return secmax == Integer.MIN_VALUE ? -1 : secmax;
    }
}