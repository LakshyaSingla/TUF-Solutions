class Solution {
    public List<Integer> leaders(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[n-1]);
        int max = nums[n-1];
        for(int i = n-2; i >=0;i--){
            if(nums[i] > max){
                max = nums[i];
                ans.add(nums[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}