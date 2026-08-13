class Solution {
    void backtrack(int index,int n , int[] candidates, int target,List<List<Integer>> ans,  List<Integer> current){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || index == n) return;

        current.add(candidates[index]);
        backtrack(index + 1, n, candidates, target - candidates[index], ans, current);

        current.remove(current.size() - 1);
        for(int j = index + 1; j < n; j++){
            if(candidates[j] != candidates[index]){
                backtrack(j, n, candidates, target, ans, current);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates.length,candidates, target, ans, current);
        return ans;
    }
}