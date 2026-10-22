class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length, m = mat[0].length;
       int i = 0, j = m - 1, ans = -1;
       while(i < n && j >= 0){
        if(mat[i][j] == 1){
            j--;
            ans = i;
        }else{
            i++;
        }
       }
       return ans;
    }
}