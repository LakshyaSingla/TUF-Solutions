class Solution {
    public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
        Set<Integer> st = new HashSet<>();
        for(int num : goodNumbers){
            st.add(num);
        }
        int count = 0, max = 0;
        for(int num : nums){
            if(st.contains(num)){
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }
        return max;
    }
}