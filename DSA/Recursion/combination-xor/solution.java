class Solution {
    void backtrack(int index, int currXor, int[] nums, int k, List<Integer> curr, List<List<Integer>> ans ){

        if(index == nums.length){
            if(currXor == k && !curr.isEmpty()){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        curr.add(nums[index]);
        backtrack(index + 1, currXor ^ nums[index], nums, k, curr, ans);
        curr.remove(curr.size() - 1);
        backtrack(index + 1, currXor, nums, k, curr, ans);
    }
    public List<List<Integer>> combinationXor(int[] nums, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0, 0, nums, k, curr, ans);
        return ans;
    }
}