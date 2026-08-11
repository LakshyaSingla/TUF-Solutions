class Solution {
    int countsum(int[] nums, int index, int k){
        if(k == 0) return 1;
        if(k < 0 || index == nums.length) return 0;

        int a = countsum(nums, index + 1, k - nums[index]);
        int b = countsum(nums, index + 1, k);
        return a + b;
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        return countsum(nums, 0, k);
    }
}