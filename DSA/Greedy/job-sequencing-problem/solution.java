class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int maxDeadline = -1;
        for(int[] it : Jobs){
            maxDeadline = Math.max(maxDeadline, it[1]);
        }
        int[] deadline = new int[maxDeadline];
        Arrays.fill(deadline, -1);
        int count = 0, profit = 0;
        for(int[] job : Jobs){
            for(int j = job[1] - 1; j >= 0; j-- ){
                if(deadline[j] == -1){
                count++;
                deadline[j] = job[0];
                profit += job[2];
                break;
            }
            }
            
        }
        return new int[]{count, profit};
    }
}