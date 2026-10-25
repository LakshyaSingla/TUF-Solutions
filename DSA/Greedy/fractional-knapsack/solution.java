class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        // Your code goes here
        int n = val.length;
        
        double[][] ratio = new double[n][2];
        for(int i = 0; i < n; i++){
            ratio[i][0] = (double) val[i]/ wt[i];
            ratio[i][1] = i;
        }
        Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));
        double total = 0.0;
        for(double[] r : ratio){
            int i = (int) r[1];
            if(wt[i] <= cap){
                total += val[i];
                cap -= wt[i];
            }else{
                total += r[0] * cap;
                break;
            }
        }
        return total;
    }
}