class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int l = 1, r = 0;
        int count = 1, max = 1;
        while(l < Arrival.length){
            if(Arrival[l] <= Departure[r]){
                count++;
                l++;
            }else{
                count--;
                r++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}