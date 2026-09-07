class Solution {
    boolean isPossible(int mid, int[] nums, int m){
        int n = nums.length;

        int student = 1, pages = 0;
        for(int i = 0; i < n; i++){
            if(pages + nums[i] <= mid){
                pages += nums[i];
            }else{
                student++;
                pages = nums[i];
            }
        }
        return student <= m;
    }
    public int findPages(int[] nums, int m) {
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        if(n < m) return -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(mid, nums, m)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}