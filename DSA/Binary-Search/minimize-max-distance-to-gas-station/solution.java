class Solution {
    int NoOfStation(double mid, int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            int noInBetween = (int) ((arr[i] - arr[i - 1]) / mid);
            if((arr[i] - arr[i -1]) == noInBetween * mid){
                noInBetween--;
            }
            count += noInBetween;
        }
        return count;
    }
    public double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;
        double low = 0, high = 0;

        for(int i = 0; i < n - 1; i++){
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        double diff = 1e-6;
        while(high - low > diff){
            double mid = low + (high - low) / 2.0;
            int count = NoOfStation(mid, arr);
            if(count > k){
                low = mid;
            }else{
                high = mid;
            }
        }
        return high;
    }
}
