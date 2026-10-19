class Solution {
    boolean isPossible(int[] a, int mid, int k){
        long sum = 0, count = 1;
        for(int num : a){
            if(sum + num > mid){
                count++;
                sum = num;
            }else{
                sum += num;
            }
        }
        return count <= k;
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int n = a.length;
        int low = 0, high = 0;
        for(int num : a){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(a, mid, k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
