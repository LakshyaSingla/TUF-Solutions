class Solution {
    public String minWindow(String s1, String s2) {
        // User code goes here
        int n = s1.length();
        int m = s2.length();
        int i = 0, j = 0, sIndex = -1, min = Integer.MAX_VALUE;
        while(i < n){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            if(j == m){
                int end = i;
                j--;
                while(j >= 0){
                    if(s2.charAt(j) == s1.charAt(i)){
                        j--;
                    }
                    i--;
                }
                i++;
                int len = end - i + 1;
                j = 0;
                if(len < min){
                    min = len;
                    sIndex = i;
                }
            }
            i++;
        }
        return (sIndex == -1) ? "" : s1.substring(sIndex, sIndex + min);
    }
}