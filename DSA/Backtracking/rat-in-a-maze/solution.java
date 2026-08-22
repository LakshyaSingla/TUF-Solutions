class Solution {
    void path(int[][] grid, int i, int j, List<String> ans, String curr, int n){
        if(i == n - 1 && j == n - 1){
            ans.add(curr);
            return;
        }
        if(grid[i][j] == 0) return;
        grid[i][j] = 0;

        if(i > 0) path(grid, i - 1, j, ans, curr + 'U', n);
        if(j > 0) path(grid, i, j - 1, ans, curr + 'L', n);
        if(i < n -1) path(grid, i + 1, j, ans, curr + 'D', n);
        if(j < n-1) path(grid, i, j + 1, ans, curr + 'R', n);
        grid[i][j] = 1;
    }
    public List<String> findPath(int[][] grid) {
        //your code goes here
        int n = grid.length;
        List<String> ans = new ArrayList<>();
        if(grid[0][0] == 0 || grid[n-1][n-1] == 0){
            return ans;
        }
        path(grid, 0, 0, ans, "", n);
        return ans;
    }
}