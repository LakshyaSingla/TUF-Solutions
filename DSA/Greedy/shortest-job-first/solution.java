class Solution {
    public long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);
        long waitTime = 0, time = 0;
        for(int i = 0; i < bt.length; i++){
            waitTime += time;
            time += bt[i];
        }
        return waitTime / bt.length;
    }
}