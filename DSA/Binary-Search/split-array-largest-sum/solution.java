class Solution {
    boolean isPossible(int mid, int[] a, int k){
        int sum = 0, count = 1;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum > mid){
                count++;
                sum = a[i];
            }
        }
        return (count <= k);
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = a[0], high = 0;
        for(int num : a){
            low = Math.max(low, num);
            high += num;
        }
        if(a.length < k) return -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(mid, a, k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
