class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            while(i > 0 && i < n1 && nums1[i] == nums1[i - 1]) i++;
            while(j > 0 && j < n2 && nums2[j] == nums2[j - 1]) j++;
            if(i >= n1 || j >= n2) break;
            if(nums1[i] < nums2[j]){
                ans.add(nums1[i]);
                i++;
            }else if(nums1[i] > nums2[j]){
                ans.add(nums2[j]);
                j++;
            }else{
                i++;
                j++;
            }
        }
        while(i < n1){
            if(i == 0 || nums1[i] != nums1[i - 1]){
                ans.add(nums1[i]);
            }
            i++;
        }
        while(j < n2){
            if(j == 0 || nums2[j] != nums2[j - 1]){
                ans.add(nums2[j]);
            }
            j++;
        }
        
        int[] res = new int[ans.size()];
        for(int l = 0; l < ans.size(); l++){
            res[l] = ans.get(l);
        }
        return res;
    }
}