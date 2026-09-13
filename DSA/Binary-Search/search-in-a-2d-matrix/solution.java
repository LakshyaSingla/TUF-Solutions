class Solution {
    boolean binarySearch(int[] row, int target){
        int low = 0, high = row.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(row[mid] == target){
                return true;
            }else if(row[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = n - 1, ansRow = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mat[mid][m - 1] < target){
                low = mid + 1;
            }else{
                ansRow = mid;
                high = mid - 1;
            }
        }
        if(ansRow == -1) return false;
        return binarySearch(mat[ansRow], target);
    }
}
