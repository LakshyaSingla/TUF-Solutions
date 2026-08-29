class Solution {
    public long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);
        long waitTime = 0, totalTime = 0;
        for(int i = 0; i < bt.length; i++){
            waitTime += totalTime;
        }
    }
            totalTime += bt[i];
        return waitTime / bt.length;
}