class Solution {
    public int maximumValue(int[] nums, int k) {
        int n = nums.length;
        int l = k, r = k;
        int max = nums[k];
        int minValue = max;
        while(l > 0 || r < n - 1){
            int leftValue = (l > 0) ? nums[l - 1] : -1;
            int rightValue = (r < n - 1) ? nums[r + 1] : -1;
            if(leftValue >= rightValue){
                minValue = Math.min(minValue, leftValue);
                l--;
            }else{
                minValue = Math.min(minValue, rightValue);
                r++;
            }
            int len = r - l + 1;
            max = Math.max(max, len * minValue);
        }
        return max;
    }
}
