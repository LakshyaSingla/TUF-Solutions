class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int maxDeadline = -1;
        for(int[] job : Jobs){
            maxDeadline = Math.max(maxDeadline, job[1]);
        }
        int[] deadlines = new int[maxDeadline];
        Arrays.fill(deadlines, -1);
        int count = 0,profit= 0;
        for(int[] job : Jobs){
            for(int j = job[1] - 1; j >= 0; j--){
                if(deadlines[j] == -1){
                    deadlines[j] = job[0];
                    count++;
                    profit+= job[2];
                    break;
                }
            }
        }
        return new int[]{count, profit};
    }
}