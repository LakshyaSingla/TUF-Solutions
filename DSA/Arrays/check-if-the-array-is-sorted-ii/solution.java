class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        return ans(nums, 0, 1);
    }
    boolean ans(ArrayList<Integer> nums, int left, int right){
        if(right >= nums.size()) return true;

        if(nums.get(left) > nums.get(right)) return false;
        return ans(nums, left +1, right + 1);
    }
}