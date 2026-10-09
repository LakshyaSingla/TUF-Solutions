class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }

        for(int num : nums){
            if(!st.contains(num - 1)){
                int x = num;
                int count = 1;

                while(st.contains(x + 1)){
                    x = x + 1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}