class Solution {
    int PoW(int mid, int N, int M){
        long ans = 1, base = mid;
        while(N > 0){
            if(N % 2 == 1){
                ans *= base;
                N--;
                if(ans > M) return 2;
            }else{
                base*= base;
                N /= 2;
                if(base > M) return 2;
            }
        }
        if(ans == M) return 1;
        return 0;
    }
    public int NthRoot(int N, int M) {
        int low = 1, high = M;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midN = PoW(mid, N, M);
            if(midN == 1) return mid;
            else if(midN == 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
