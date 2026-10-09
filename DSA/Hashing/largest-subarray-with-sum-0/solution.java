class Solution {
    public int maxLen(int[] arr) {
        // Your code goes here
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0, maxlen = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                maxlen = Math.max(maxlen, i + 1);
            }

            if(mpp.containsKey(sum)){
                int len = i - mpp.get(sum);
                maxlen = Math.max(len, maxlen);
            }else{
                mpp.put(sum, i);
            }
            
        }
        return maxlen;
    }
}
