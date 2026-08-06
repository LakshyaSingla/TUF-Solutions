class Solution {
    List<Integer> generateRow(int row){
        List<Integer> ansRow = new ArrayList<>();
        long res = 1;
        ansRow.add(1);
        for(int col = 1; col < row; col++){
            res *= (row - col);
            res /= col;
            ansRow.add((int) res);
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