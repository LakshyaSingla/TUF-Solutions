class Solution {
    public int maxLen(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int max = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                max = Math.max(max, i + 1);
            }
            if(mpp.containsKey(sum)){
                int len = i - mpp.get(sum);
                max = Math.max(max, len);
            }else{
                mpp.put(sum, i);
            }
        }
        return max;
    }
}
