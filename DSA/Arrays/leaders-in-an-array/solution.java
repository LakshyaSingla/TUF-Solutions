class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        ans.add(nums[n - 1]);
        int max = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}