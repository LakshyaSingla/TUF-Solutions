class Solution {
    boolean noOfDays(int[] weights, int days, int mid){
        int day = 1;
        int capacity = 0;
        for(int i = 0; i < weights.length; i++){
            if(capacity + weights[i] > mid){
                day++;
                capacity = 0;
            }
            capacity += weights[i];
        }
        return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        // Your code goes 
        int low = Integer.MIN_VALUE, high = 0;
        for(int num : weights){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(noOfDays(weights, days, mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}