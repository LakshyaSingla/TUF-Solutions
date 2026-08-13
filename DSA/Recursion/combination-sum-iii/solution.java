class Solution {
    void backtrack(int n, int start,int k, List<List<Integer>> ans,List<Integer> curr){
        if(n == 0 && curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(n < 0 || curr.size() > k) return;
        for(int i = start; i <= 9; i++){
            if(i > n) break;

                curr.add(i);
                backtrack(n - i, i + 1, k , ans, curr);
                curr.remove(curr.size() - 1);
            
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> curr = new ArrayList<>();
         backtrack(n, 1, k, ans, curr);
         return ans;
    }
}