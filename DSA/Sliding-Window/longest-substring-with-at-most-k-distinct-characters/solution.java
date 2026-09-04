class Solution {
    public int kDistinctChar(String s, int k) {
        //your code goes here
        int n = s.length();
        int l = 0, r= 0, maxlen = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();

        while(r < n){
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);

            if(mpp.size() > k){
                mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                if(mpp.get(s.charAt(l)) == 0){
                    mpp.remove(s.charAt(l));
                }
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}