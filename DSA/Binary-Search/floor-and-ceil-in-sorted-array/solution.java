class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor = getFloor(nums, x);
       int ceil = getCeil(nums, x);
       return new int[]{floor, ceil};
       
    }
    public int getFloor(int[] nums, int x){
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            
        }
        return ans;
    }
    public int getCeil(int[] nums, int x){
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        return ans;
    }
 }