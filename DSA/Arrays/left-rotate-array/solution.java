class Solution {
    void reverseArr(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
    public void rotateArray(int[] nums, int k) {
        int n = nums.length; 
        k = k % n;
        reverseArr(nums, 0, n - 1);
        reverseArr(nums, 0, n - 1 - k);
        reverseArr(nums, n - k , n - 1);
    }
}