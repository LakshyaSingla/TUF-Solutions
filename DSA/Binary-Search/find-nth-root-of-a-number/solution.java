class Solution {
    int func(int mid, int N, int M){
        long ans = 1, base = mid;
        while(N > 0){
            if(N % 2 == 1){
                ans *= base;
                if(ans > M) return -1;
                N--;
            }else if(N%2 == 0){
                N /= 2;
                base *= base;
                if(base > M) return -1;
            }
        }
        if(ans == M) return 1;
        return 0;
    }
    public int NthRoot(int N, int M) {
        int low = 1, high = M;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int ans = func(mid, N, M);
            if(ans == 1) return mid;
            else if(ans == -1) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
