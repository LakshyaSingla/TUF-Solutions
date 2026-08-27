class Solution {
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n = grid.length;
        if(grid[0][0] == 0 || grid[n - 1][n - 1] == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        path(0, 0, grid,ans,"");
        return ans; 
    }
    void path(int i, int j, int[][] grid, List<String> ans, String curr){
        if(i == grid.length - 1 && j == grid.length - 1){
            ans.add(curr);
            return;
        }
        
        if( i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] == 0 ){
            return ;
        }
        grid[i][j] = 0;
        path(i+1,j,grid,ans,curr+'D');
        path(i-1,j,grid,ans,curr+'U');
        path(i,j+1,grid,ans,curr+'R');
        path(i,j-1,grid,ans,curr+'L');
        grid[i][j] = 1;
    }
}