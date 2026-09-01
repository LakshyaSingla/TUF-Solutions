class Solution {
    public int characterReplacement(String s, int k) {
        //your code goes here
        int n = s.length();
        int l = 0, r = 0, maxlen = 0, maxfreq = 0;
        int[] hash = new int[26];

        while(r < n){
            hash[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(r) - 'A']);
            int change = (r - l + 1) - maxfreq;
            if(change > k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            if(change <= k){
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;
    }
}