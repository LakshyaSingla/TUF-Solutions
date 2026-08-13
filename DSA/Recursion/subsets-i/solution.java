class Solution {
    void backtrack(int index, int[] nums, int n, List<Integer> ans, int sum){
        if(index == n){
            ans.add(sum);
            return;
        }
        
        backtrack(index + 1, nums, n, ans, sum + nums[index]);
        backtrack(index + 1, nums, n, ans, sum );
    }
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        backtrack(0, nums, nums.length, ans, 0);
        return ans;
    }
}