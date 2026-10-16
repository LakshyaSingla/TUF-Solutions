class Solution {
    boolean CanPaint(int[] C, long mid, int A){
        long painter = 1, len = 0;
        for(int num : C){
            if(len + num > mid){
                painter++;
                len = num;
                if(painter > A) return false;
            }else{
                len += num;
            }
        }
        return true;        
    }
    public int paint(int A, int B, int[] C) {
        // Your code goes here
        long low = 0, high = 0;
        int MOD = 10000003;
        for(int num : C){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            long mid = low + (high - low) / 2;
            if(CanPaint(C, mid, A)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return (int) ((low * B) % MOD);
    }
}