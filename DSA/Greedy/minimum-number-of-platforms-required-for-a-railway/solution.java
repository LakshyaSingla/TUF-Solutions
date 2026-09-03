class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int count = 0;
        int l = 0, r = 0, max = 0;
        while(l < Arrival.length){
            if(Arrival[l] <= Departure[r]){
                count++;
                max = Math.max(max, count);
                l++;
            }else{
                count--;
                r++;
            }
        }
        return max;
    }
}