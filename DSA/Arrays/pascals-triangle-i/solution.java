class Solution {
    public int pascalTriangleI(int r, int c) {
        return nCr(r - 1, c - 1);
    }
    int nCr(int n, int r){
        if(r > n - r) r = n - r;
        if(r == 1) return n;
        int ans = 1;
        for(int i = 0; i < r; i++){
            ans *= n - i;
            ans /= i + 1;
        }
        return ans;
    }
}