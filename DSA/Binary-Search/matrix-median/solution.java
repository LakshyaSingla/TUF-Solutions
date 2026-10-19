class Solution {
    int eachRow(int x, int[] mat){
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
    int FindlessThanMid(int[][] matrix, int mid){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            count += eachRow(mid, matrix[i]);
        }
        return count;
    }
    public int findMedian(int[][] matrix) {
      int n = matrix.length, m = matrix[0].length;
      int low = 0, high = 0;
      for(int i = 0; i < n; i++){
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][m - 1]);
      }
      int req = m * n / 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int lessThanMed = FindlessThanMid(matrix, mid);
        if(lessThanMed <=  req){
            low = mid + 1;
        }else{
            high = mid - 1;
        }

      }
      return low;
    }
}