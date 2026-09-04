class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int low = 0, high = nums.length - 1;

      while(low <= high){
        int mid = low + (high - low) / 2;
        if(nums[mid] == k){
            return true;
        }
        if(nums[low] == nums[mid] && nums[mid] == nums[high]){
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
            if(k <= nums[high] && k >= nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
      }
      return false;
    }
}