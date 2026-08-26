class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);
        int maxDeadline = 0;
        for(int[] job : Jobs){
            maxDeadline = Math.max(maxDeadline, job[1]);
        }
        int[] deadlineDays = new int[maxDeadline];
        Arrays.fill(deadlineDays, -1);
        int num = 0, profit = 0;
        for(int i = 0; i < Jobs.length; i++){
            
            for(int j = Jobs[i][1] - 1; j >= 0; j--){
                if(deadlineDays[j] == -1){
                    deadlineDays[j] = Jobs[i][0];
                    profit += Jobs[i][2];
                    num++;
                    break;
                }
            }
        }
        return new int[]{num, profit};
    }
}