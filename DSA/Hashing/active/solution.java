class Solution {
    public int subarraySumDivisbleByK(int[] nums, int k) {
        int sum = 0, count = 0;
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum % k == 0) count++;
            int rem = ((sum % k) + k) % k;
            if(mpp.containsKey(rem)){
                count += mpp.get(rem);
            }
            mpp.put(rem, mpp.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}