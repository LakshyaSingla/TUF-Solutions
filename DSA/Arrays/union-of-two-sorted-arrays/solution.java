class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n1 && j < n2){
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
        while(i < n1){
            if(ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
                }
                i++;
        }
        while(j < n2){
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