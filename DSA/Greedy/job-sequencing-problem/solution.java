class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        int n = Jobs.length;
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));
        int[] deadlines = new int[n];
        int count = 0, max = 0;
        for(int i = 0; i < n; i++){
            for(int j = Jobs[i][1] - 1; j >= 0; j--){
                if(deadlines[j] == 0){
                    deadlines[j] = Jobs[i][0];
                    max += Jobs[i][2];
                    count++;
                    break;
                }
            }
        }
        return new int[]{count, max};
    }
}