class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        int n = Arrival.length;
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        
        int i = 1, count = 1;
        int j = 0, max = 1;
        while(i < n ){
            
            if(Arrival[i]<= Departure[j]){
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