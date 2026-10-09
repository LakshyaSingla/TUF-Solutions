class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int n = nums.length;
      int xor = 0, count = 0;
      Map<Integer, Integer> mpp = new HashMap<>();
      for(int i = 0; i < n; i++){
        xor ^= nums[i];
        if(xor == k) count++;
        int rem = xor ^ k;
        if(mpp.containsKey(rem)){
            count += mpp.get(rem);
        }
        mpp.put(xor, mpp.getOrDefault(xor, 0) + 1);

      }
      return count;

    }
}