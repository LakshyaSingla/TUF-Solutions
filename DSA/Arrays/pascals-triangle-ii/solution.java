class Solution {
    public int[] pascalTriangleII(int r) {
        int[] ans = new int[r];
        ans[0] = 1;
        long val = 1;
        for(int i = 1; i < r; i++){
            val *= (r - i);
            val /= i;
            ans[i] = (int) val;
        }
        return ans;
    }
}