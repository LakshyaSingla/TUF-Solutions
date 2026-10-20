class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int n = cardScore.length;
        int lsum = 0, rsum = 0;
        for(int i = 0; i < k; i++){
            lsum += cardScore[i];
        }
        int sum = lsum;
        int rIndex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            lsum -= cardScore[i];
            rsum += cardScore[rIndex--];
            sum = Math.max(sum, lsum + rsum);
        }
        return sum;
    }
}