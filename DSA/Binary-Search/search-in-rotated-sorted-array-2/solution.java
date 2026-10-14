class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int n = nums.length;
      int low = 0, high = n - 1;

      while(low <= high){
        int mid = low + (high - low) / 2;
        if(nums[mid] == k) return true;
        if(nums[mid] == nums[low] && nums[mid] == nums[high]){
            low++;
            high--;
            continue;
        }

        if(nums[mid] >= nums[low]){
            if(k < nums[mid] && k >= nums[low]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }else{
            if(k <= nums[high] && k > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
      }
      return false;
    }
}