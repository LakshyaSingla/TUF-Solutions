class Solution {
    public int pascalTriangleI(int r, int c) {
        return nCr(r - 1, c- 1);
    }
    int nCr (int n, int r){
        if(r > n - r) r = n - r;
        if(r == 1) return n;
        int result = 1;

        for(int i = 0; i < r; i++){
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}