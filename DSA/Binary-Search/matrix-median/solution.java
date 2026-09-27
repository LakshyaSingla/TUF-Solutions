class Solution {
    int eachRow(int x, int[] matrix){
        int low = 0, high = matrix.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(matrix[mid] <= x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    int findLessThanMid(int mid, int[][] matrix){
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
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][m - 1]);
      }
      int req = m * n / 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int count = findLessThanMid(mid, matrix);
        if(count <= req){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
      }
      return low;
    }
}