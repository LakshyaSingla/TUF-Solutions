class Solution {
    int Root(int N, int num, int M){
        long res = 1, base = num;
        while(N > 0){
            if(N % 2 == 1){
                res *= base;
                N--;
                if(res > M)return Integer.MAX_VALUE;
            }else{
                base *= base;
                N = N / 2;
                if(base > M)return Integer.MAX_VALUE;
            }
        }
        
        return (int) res;
    }
    public int NthRoot(int N, int M) {
        int low = 1, high = M;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(Root(N, mid, M) == M){
                return mid;
            }else if(Root(N, mid,M) < M){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
        
    }
}
