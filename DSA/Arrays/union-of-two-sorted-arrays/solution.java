class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
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
        while(i < nums1.length){
             if(ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
                }
                i++;
        }
        while(j < nums2.length){
             if(ls.isEmpty() || ls.get(ls.size() - 1) != nums2[j]){
                    ls.add(nums2[j]);
                }
                j++;
        }

        int[] ans = new int[ls.size()];
        for(int k = 0; k < ls.size(); k++){
            ans[k] = ls.get(k);
        }
        return ans;
    }
}