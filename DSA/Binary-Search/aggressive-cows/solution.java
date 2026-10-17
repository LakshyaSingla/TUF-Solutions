class Solution {
    boolean isPossible(int[] nums, int mid, int k){
        int count = 1, lastCow = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - lastCow >= mid){
                count++;
                lastCow = nums[i];
            }
            
        }
        return count >= k;
    }
    public int aggressiveCows(int[] nums, int k) {
     int n = nums.length;
     Arrays.sort(nums);
     int low = 1, high = nums[n - 1] - nums[0];
     while(low <= high){
        int mid = low + (high - low) / 2;
        if(isPossible(nums, mid, k)){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
     }   
     return high;
    }
}
