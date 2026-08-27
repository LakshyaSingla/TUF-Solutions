class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int x : nums1) st1.add(x);
        for(int x : nums2) st2.add(x);

        HashSet<Integer> res = new HashSet<>();
        for(int i : st1){
            res.add(i);
        }
        for(int i : st2){
            if(res.contains(i)){
                res.remove(i);
            }else{
                res.add(i);
            }
        }
        int[] ans = new int[res.size()];
        int j = 0;
        for(int i : res){
            ans[j++] = i;
        }
        Arrays.sort(ans);
        return ans;
    }
}