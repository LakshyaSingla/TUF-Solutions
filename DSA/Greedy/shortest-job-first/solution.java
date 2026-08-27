class Solution {
    public long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);
        int n = bt.length;
        long waittime = 0, totaltime = 0;
        for(int i = 0; i < n; i++){
            waittime += totaltime;
            totaltime += bt[i];
            
        }
        return waittime / n ;
    }
}