class Solution {
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here
        int l = 0, r = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, - 1);
        int max = 0;
        while(r < s.length()){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)] + 1;
                }
                
            }
            int len = r - l + 1;
            max = Math.max(len, max);
            hash[s.charAt(r)] = r;
            r++;
        }
        return max;
    }
}