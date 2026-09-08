class Solution {
    int func(int mid, int M, int N){
        long base = mid;
        long ans = 1;
        while(N > 0){
            if(N % 2 == 1){
                ans *= base;
                N--;
                if(ans > M) return 2;
            }else if(N % 2 == 0){
                base *= base;
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
            
            if(func(mid, M, N) == 1) return mid;
            if(func(mid, M, N) == 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
