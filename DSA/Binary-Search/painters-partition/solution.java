class Solution {
    boolean isPossible(int[] C, long mid, int A){
        int painter = 1;
        long len = 0;
        for(int num : C){
            if(len + num > mid){
                painter++;
                len = num;
            }else{
                len += num;
            }
        }
        return painter <= A;
    }
    public int paint(int A, int B, int[] C) {
        // Your code goes here
        int MOD = 10000003;
        long low = 0, high = 0;
        for(int num : C){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            long mid = low + (high - low) / 2;
            if(isPossible(C, mid, A)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return (int) ((low * B) % MOD); 
    }
}