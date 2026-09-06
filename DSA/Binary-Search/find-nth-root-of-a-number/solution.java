class Solution {
    int PoW(int mid, int N, int M){
        long base = mid;
        long ans = 1;
        while(N > 0){
            if(N % 2 == 1){
            ans *= base;
            if(ans > M) return 2;
            N--;
        }else if(N % 2 == 0){
            base *= base;
            N/=2;
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
            if(PoW(mid, N, M) == 1){
                return mid;
            }else if(PoW(mid, N, M) == 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
