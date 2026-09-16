class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;
       int row = 0, col = m - 1, index = -1;
       while(row < n && col >= 0){
        if(mat[row][col] == 0){
            row++;
        }else{
            index = row;
            col--;
        }
       }
       return index;
    }
}