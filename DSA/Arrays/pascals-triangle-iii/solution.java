class Solution {
    List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col = 1; col < row; col++){
            ans *= (row - col);
            ans /= col;
            ansRow.add((int) ans);
        }
        return ansRow;
        
    }
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= n; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
}