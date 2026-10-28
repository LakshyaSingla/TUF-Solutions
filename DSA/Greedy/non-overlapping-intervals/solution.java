class Solution {
    public int MaximumNonOverlappingIntervals(int[][] intervals) {
        //your code goes here
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int count = 1, limit = intervals[0][1];
        for(int i = 1; i < n; i++){
            if(intervals[i][0] >= limit){
                count++;
                limit = intervals[i][1];
            }
        }
        return n - count;
    }
}