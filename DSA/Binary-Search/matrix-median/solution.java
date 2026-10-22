class Solution {
    int eachRow(int[] mat, int x){
       
        int low = 0, high = mat.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mat[mid] <= x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    int findlessThan(int[][] matrix, int mid){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            count += eachRow(matrix[i], mid);
        }
        return count;
    }
    public int findMedian(int[][] matrix) {
      int n = matrix.length, m = matrix[0].length;
      int low = Integer.MAX_VALUE, high = 0;
      for(int i = 0; i < n; i++){
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][m - 1]);

      }
      int req = m * n / 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int count = findlessThan(matrix, mid);
        if(count > req){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
      }
      return low;
    }
}