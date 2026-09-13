class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;
       int row = 0, col = m - 1;
       int ans = -1;
       while(row < n && col >= 0){
        if(mat[row][col] == 1){
            ans = row;
            col--;
        }else{
            row++;
        }
       }
       return ans;
    }
}