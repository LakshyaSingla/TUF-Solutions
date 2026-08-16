class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int count = 0;
      int n = nums.length;
      int xr = 0;
      HashMap<Integer, Integer> mpp = new HashMap<>();
      for(int i = 0; i < n; i++){
        xr ^= nums[i];
        if(xr == k) count++;
        int rem = xr ^ k;
        if(mpp.containsKey(rem)){
            count+= mpp.get(rem);
        }
        mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
      }
      return count;
    }
}