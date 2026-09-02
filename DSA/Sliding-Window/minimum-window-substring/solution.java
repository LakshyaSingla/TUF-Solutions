class Solution {
    public String minWindow(String s, String t) {
        //your code goes here
        int n = s.length();
        int m = t.length();

        int[] hash = new int[256];
        int l = 0, r = 0, sIndex = -1, count = 0, minlen = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            hash[t.charAt(i)]++;
        }
        while(r < n){
            if(hash[s.charAt(r)] > 0){
                count++;
            }
            hash[s.charAt(r)]--;

            while(count == m){
                if(r - l + 1 < minlen){
                    minlen = r - l + 1;
                    sIndex = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return (sIndex == -1) ? "" : s.substring(sIndex, sIndex + minlen);
    }
}