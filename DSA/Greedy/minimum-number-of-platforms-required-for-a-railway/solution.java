class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int i = 1, count = 1;
        int j = 0, max = 1;
        while(i < Arrival.length){
            if(Arrival[i] <= Departure[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}