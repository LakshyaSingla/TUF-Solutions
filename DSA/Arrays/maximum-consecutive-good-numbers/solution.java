class Solution {
    public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < goodNumbers.length; i++){
            st.add(goodNumbers[i]);
        }
        int count = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            if(st.contains(nums[i])){
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }
        return max;
    }
}