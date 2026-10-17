class Solution {
    boolean isPossible(int[] nums, int mid, int m){
        int count = 1, sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= mid){
                sum += nums[i];
            }else{
                count++;
                sum = nums[i];
            }
        }
        return count <= m;
    }
    public int findPages(int[] nums, int m) {
        int n = nums.length;
        int low = 0, high = 0;
        if(m > n) return -1;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(nums, mid, m)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}