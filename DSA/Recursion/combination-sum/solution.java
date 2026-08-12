class Solution {
    void backtrack(int index,int n, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(target < 0 || index == n){
            return;
        }

        current.add(candidates[index]);
        backtrack(index, n, candidates, target - candidates[index], current, ans);
        current.remove(current.size() - 1);
        backtrack(index + 1,n, candidates, target, current, ans);
        

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, candidates.length,candidates, target, current, ans);
        return ans;

    }
}