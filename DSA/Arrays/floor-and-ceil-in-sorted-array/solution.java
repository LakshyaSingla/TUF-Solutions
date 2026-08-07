class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                return new int[] {x, x}; 
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int floor = (high >= 0) ? nums[high] : -1;
        int ceil = (low < nums.length) ? nums[low] : -1;

        return new int[] {floor, ceil};
    }
}