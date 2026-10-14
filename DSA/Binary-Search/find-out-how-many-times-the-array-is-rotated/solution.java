class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int low = 0, high = n - 1;
        int minIndex = -1, min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums.get(mid) >= nums.get(low)){
                if(nums.get(low) < min){
                    min = nums.get(low);
                    minIndex = low;
                }
                low = mid + 1;
            }else{
                if(nums.get(mid) < min){
                    min = nums.get(mid);
                    minIndex = mid;
                }
                high = mid - 1;
            }
        }
        return minIndex;
    }
}