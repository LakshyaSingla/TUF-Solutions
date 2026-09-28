class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                if(ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
                }
                i++;
            }else{
                if(ls.isEmpty() || ls.get(ls.size() - 1) != nums2[j]){
                    ls.add(nums2[j]);
                }
                j++;
            }
        }
        while(i < n){
            if(ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
            }
                i++;
        }
        while(j < m){
            if(ls.isEmpty() || ls.get(ls.size() - 1) != nums2[j]){
                    ls.add(nums2[j]);
                }
                j++;
        }
        int[] ans = new int[ls.size()];
        for(int l = 0; l < ls.size(); l++){
            ans[l] = ls.get(l);
        }
        return ans;
    }
}