class Solution {
    int firstOccurence(int[] arr, int k){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == k){
                ans = mid;
                high = mid - 1;
            }else if(arr[mid] < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    int lastOccurence(int[] arr, int k){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == k){
                ans = mid;
                low = mid + 1;
            }else if(arr[mid] < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public int countOccurrences(int[] arr, int target) {
        // Your code goes here
        int first = firstOccurence(arr, target);
        if(first == -1) return 0;
        int second = lastOccurence(arr, target);
        return (second - first + 1);
    }
}
