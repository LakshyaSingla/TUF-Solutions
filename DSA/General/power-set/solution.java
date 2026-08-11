class Solution {
    void backtrack(int index, int n, int[] nums, List<Integer> current, List<List<Integer>> ans){

        if(index == n){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(index + 1, n, nums, current, ans);
        current.remove(current.size() - 1);
        backtrack(index + 1, n, nums, current, ans);
    }
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        int n = nums.length;
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, n, nums, current, ans);
        return ans;
    }
}