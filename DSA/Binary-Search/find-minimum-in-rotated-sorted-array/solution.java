class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int n = arr.size();

      int low = 0, high = n - 1, ans = Integer.MAX_VALUE;

      while(low <= high){
        int mid = low + (high - low) / 2;

        if(arr.get(low) <= arr.get(high)){
            ans = Math.min(ans, arr.get(low));
            break;
        }
        if(arr.get(mid) >= arr.get(low)){
            ans = Math.min(ans, arr.get(low));
            low = mid + 1;
        }else{
            ans = Math.min(ans, arr.get(mid));
            high = mid - 1;
        }
      }
      return ans;
    }
}
