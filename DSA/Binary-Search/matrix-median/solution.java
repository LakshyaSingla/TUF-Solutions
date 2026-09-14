class Solution {
    int upperBound(int[] arr, int mid, int m){
        int low = 0, high = m - 1;
        int ans = m;
        while(low <= high){
            int x = low + (high - low) / 2;
            if(arr[x] > mid){
                ans = x;
                high = x - 1;
            }else{
                low = x + 1;
            }
        }
        return ans;
    }
    int countsmallEqual(int mid, int[][] matrix, int n, int m){
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
        high = Math.max(high, matrix[i][m - 1]);
      }
      int req = (m * n) / 2;
      while(low <= high){
        int mid = low + (high - low) / 2;
        int smallEqual = countsmallEqual(mid, matrix, n, m);
        
        if(smallEqual <= req) low = mid + 1;
        else high = mid - 1;

      }
      return low;
    }
}