        }
        if(ans == M) return 1;
                N /= 2;
                if(base > M) return 2;
            }
                if(ans > M) return 2;
            }else{
                base*= base;
                ans *= base;
                N--;
        long ans = 1, base = mid;
        while(N > 0){
            if(N % 2 == 1){
class Solution {
    int PoW(int mid, int N, int M){