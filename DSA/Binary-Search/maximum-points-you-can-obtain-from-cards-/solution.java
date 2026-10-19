class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int lsum = 0, rsum = 0;
        int n = cardScore.length;
        for(int i = 0; i < k; i++){
            lsum += cardScore[i];
        }
        int sum = lsum;

        int rIndex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            rsum += cardScore[rIndex--];
            lsum -= cardScore[i];
            sum = Math.max(sum, lsum + rsum);
        }
        return sum;
    }
}