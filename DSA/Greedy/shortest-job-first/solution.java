class Solution {
    public long solve(int[] bt) {
        //your code goes here
        int n = bt.length;
        Arrays.sort(bt);
        long waitTime = 0, time = 0;
        for(int i = 0; i < n; i++){
            waitTime += time;
            time += bt[i];
        }
        return waitTime / n;
    }
}