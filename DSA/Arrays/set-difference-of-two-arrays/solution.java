class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;

        while(i < n && j < m){
            while(i > 0 && i < n && nums1[i] == nums1[i - 1]) i++;
            while(j > 0 && j < m && nums2[j] == nums2[j - 1]) j++;
            if(i >= n || j >= m) break;
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
        while(i < n){
            if(i == 0 || nums1[i] != nums1[i - 1]){
                ls.add(nums1[i]);
            }
            i++;
        }
        while(j < m){
            if(j == 0 || nums2[j] != nums2[j - 1]){
                ls.add(nums2[j]);
            }
            j++;
        }

        int[] ans = new int[ls.size()];
        for(int k = 0; k < ans.length; k++){
            ans[k] = ls.get(k);
        }
        return ans;
    }
}