class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int low = 0, high = n - 1, minIndex = -1, min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums.get(mid)  >= nums.get(low) ){
                if(nums.get(low) < min){
                    minIndex = low;
                    min = nums.get(low);
                }
                
                low = mid + 1;
            }else{
                if(nums.get(mid) < min){
                    minIndex = mid;
                    min = nums.get(mid) ;
                }
                high = mid - 1;
            }
        }
        return minIndex;
    }
}