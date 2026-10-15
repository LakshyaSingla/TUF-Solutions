class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                ls.add(nums1[i]);
                i++;
            }else if(nums1[i] > nums2[j]){
                ls.add(nums2[j]);
                j++;
            }else{
                i++;
                j++;
            }
        }
        while(i < n1){
            if(ls.get(ls.size() - 1) != nums1[i]){
                ls.add(nums1[i]);
            }
            i++;
        }
        while(j < n2){
            if(ls.get(ls.size() - 1) != nums2[j]){
                ls.add(nums2[j]);
            }
            j++;
        }

        int[] ans = new int[ls.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}