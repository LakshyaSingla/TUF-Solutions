
class Solution {
    boolean noOfDays(int[] nums, int mid, int k, int m, int n){
        int count = 0, noOfB = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] <= mid){
                count++;
            }else{
                noOfB += count / k;
                count = 0;
            }
        }
        noOfB += count / k;
        return noOfB >= m;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int num : nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        if((long) m * k > n) return -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(noOfDays(nums, mid, k, m, n)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}


