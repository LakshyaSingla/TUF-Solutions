class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int n = nums.length;
      HashMap<Integer, Integer> mpp = new HashMap<>();
      int xr = 0, count = 0;

      for(int i = 0; i < n; i++){
        xr ^= nums[i];
        if(xr == k) count++;
        int rem = xr ^ k;
        if(mpp.containsKey(rem)){
            count += mpp.get(rem);
        }
        mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
      }
      return count;
    }
}