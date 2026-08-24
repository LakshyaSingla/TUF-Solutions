class Solution {
    void move(int i, int j, int[][] grid, String dir,List<String> ans){
        if(i == grid.length - 1 && j == grid.length - 1){
            ans.add(dir);
            return;
        }
        if(grid[i][j] == 0) return;
        grid[i][j] = 0;
        if(i > 0)move(i-1,j,grid,dir+'U',ans);
        if(i<grid.length - 1)move(i+1,j,grid,dir+'D',ans);
       if(j>0) move(i,j-1,grid,dir+'L',ans);
        if(j<grid.length -1 )move(i, j+1, grid, dir + 'R', ans);
        grid[i][j] = 1;

    }
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n = grid.length;
        List<String> ans = new ArrayList<>();
        if(grid[0][0] == 0 || grid[n-1][n-1] == 0) return ans;

        move(0,0,grid,"", ans);
        return ans;

    }
}