class Solution {
    boolean isPossible(int mid, int[] nums, int k){
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
        if(k > nums.length) return -1;
        int low =1;
        int n = nums.length;
        Arrays.sort(nums);
        int high = nums[n - 1] - nums[0];
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(mid, nums, k)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
}
