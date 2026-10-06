class Solution {
    List<Integer> generateRow(int row){
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        long res = 1;
        for(int i = 1; i < row; i++){
            res *= (row - i);
            res /= i;
            ansRow.add((int)res);
        }
        return ansRow;
    }
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}