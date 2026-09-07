
class Solution {
    boolean possibleDay(int mid, int k, int m, int[] nums){
        int n = nums.length;
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
       int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
       if((long) k * m > n) return -1;
       for(int num : nums){
        min = Math.min(min, num);
        max = Math.max(max, num);
       }
       int low = min, high = max;
       while(low <= high){
        int mid = low + (high - low) / 2;
        if(possibleDay(mid, k, m, nums)){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
       }
       return low;
    }
}


