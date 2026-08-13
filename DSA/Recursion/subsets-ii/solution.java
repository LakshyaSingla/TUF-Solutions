class Solution {
    void backtrack(int index, int n, int[] nums, List<List<Integer>> ans, List<Integer> current){

        if(index == n){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(index + 1, n ,nums, ans, current);
        current.remove(current.size() - 1);
        for(int i = index + 1; i < n; i++){
            if(nums[i] != nums[index]){
                backtrack(i, n, nums,ans,current);
                return;
            }
        }
        backtrack(n, n, nums, ans, current);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        backtrack(0, n, nums, ans, current);
        return ans;
    }
}