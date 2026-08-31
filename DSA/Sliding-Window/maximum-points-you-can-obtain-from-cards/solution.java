class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int lsum = 0, rsum =0;
        int sum = 0;
        int n = cardScore.length;
        for(int i = 0; i < k; i++){
            lsum += cardScore[i];
        }
        sum = lsum;
        int rindex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            rsum+= cardScore[rindex];
            lsum-= cardScore[i];
            rindex--;
            sum = Math.max(sum, rsum + lsum);
        }
        return sum;
    }
}