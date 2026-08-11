class Solution {
    public int[] reverseArray(int[] nums) {
        //your code goes here
        return ans(nums, 0, nums.length - 1);
    }
    int[] ans(int[] nums, int left, int right){
        if(left >= right) return nums;

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        return ans(nums, left + 1, right - 1);
    }
}