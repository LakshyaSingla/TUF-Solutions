class Solution {
    public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
        HashSet<Integer> st = new HashSet<>();
        for(int x : goodNumbers){
            st.add(x);
        }
        int maxlen = 0, len = 0;
        for(int i = 0; i < nums.length; i++){
            if(st.contains(nums[i])){
                len++;
                maxlen = Math.max(maxlen, len);
            }else{
                len = 0;
            }
        }
        return maxlen;
    }
}