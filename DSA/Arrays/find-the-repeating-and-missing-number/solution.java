class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;

        long s = 0, s2 = 0;
        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        for(int i = 0; i < n; i++){
            s += nums[i];
            s2 += (long) nums[i] * (long) nums[i];
        }
        long val1 = s - sn;
        long val2 = (s2 - s2n) / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        return new int[]{(int) x, (int) y};
    }
}