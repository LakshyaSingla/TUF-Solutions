class Solution {
    void path(int[][] grid, int x, int y, String curr, int n, List<String> ans){
        if(x == n - 1 && y == n - 1){
            ans.add(curr);
            return;
        }
        if(grid[x][y] == 0) return;
        grid[x][y] = 0;

        if(x > 0) path(grid, x - 1, y, curr + 'U', n, ans);
        if(x < n - 1) path(grid, x+1,y,curr+'D',n, ans);
        if(y>0) path(grid, x, y - 1, curr + 'L', n, ans);
        if(y < n - 1) path(grid, x, y+ 1, curr + 'R', n, ans);
        grid[x][y] = 1;
    }
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n = grid.length;
        List<String> ans = new ArrayList<>();
        if(grid[0][0] == 0 || grid[n-1][n-1] == 0){
            return ans;
        }
        path(grid, 0, 0, "", n, ans);
        return ans;
    }
}