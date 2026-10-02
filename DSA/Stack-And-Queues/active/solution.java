class Solution {
    public int maximumValue(int[] nums, int k) {
        int n = nums.length;
        int l = k, r = k;
        int minValue = nums[k];
        int max = minValue;
        while(l > 0 || r < n - 1){
            int leftVal = (l > 0) ? nums[l - 1] : -1;
            int rightVal = (r < n - 1) ? nums[r + 1] : -1;
            if(leftVal > rightVal){
                l--;
                minValue = Math.min(minValue, leftVal); 
            }else{
                r++;
                minValue = Math.min(minValue, rightVal);
            }
            int length = r - l + 1;
            max = Math.max(max, length * minValue);
        }
        return max;
    }
}
