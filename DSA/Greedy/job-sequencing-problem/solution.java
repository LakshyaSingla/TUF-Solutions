class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int n = Jobs.length;
        int count = 0, max = 0;
        int[] deadlines = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = Jobs[i][1] - 1; j >= 0; j--){
                if(deadlines[j] == 0){
                    deadlines[j] = Jobs[i][0];
                    count++;
                    max += Jobs[i][2];
                    break;
                }
            }
            

        }
        return new int[]{count, max};
    }
}