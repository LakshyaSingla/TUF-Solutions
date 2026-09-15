class Solution {
    int upperBound(int[] matrix, int mid, int m){
        int low = 0, high = m - 1;
        
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
    int countbeforeMid(int mid, int[][] matrix, int m, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            count += upperBound(matrix[i], mid, m);
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
      int req = m * n / 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int beforeMid = countbeforeMid(mid, matrix, m, n);
        if(beforeMid <= req){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
      }
      return low;
    }
}