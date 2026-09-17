class Solution {
    int eachRow(int mid, int[] matrix){
        int low = 0, high = matrix.length - 1;
        while(low <= high){
            int x = low + (high - low) / 2;
            if(matrix[x] <= mid){
                low = x + 1;
            }else{
                high = x - 1;
            }
        }
        return low;
    }
    int countNum(int mid, int[][] matrix){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            count += eachRow(mid, matrix[i]);
        }
        return count;
    }
    public int findMedian(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;
      int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
      for(int i = 0; i < n; i++){
        low = Math.min(matrix[i][0], low);
        high = Math.max(matrix[i][m - 1], high);
      }
      int req = (m * n)/ 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int countValue = countNum(mid, matrix);
        if(countValue <= req){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
      }
      return low;
    }
}