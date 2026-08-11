class Solution {
    boolean summation(int index, int k, int[] nums){
        

        if(k == 0) return true;
        if(k < 0 || index == nums.length) return false;
        

        return summation(index + 1, k - nums[index], nums) || summation(index+1, k, nums);
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
         //your code goes here
         return summation(0, k, nums);

    }
}