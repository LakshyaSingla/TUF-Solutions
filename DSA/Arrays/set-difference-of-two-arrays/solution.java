class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> one = new HashSet<>();
        for(int x : nums1){
            one.add(x);
        }
        HashSet<Integer> two = new HashSet<>();
        for(int x : nums2){
            two.add(x);
        }
        
        HashSet<Integer> res = new HashSet<>();
        for(int num : one){
            res.add(num);
           
        }
        for(int num : two){
            if(!res.contains(num)){
                res.add(num);
            }else{
                res.remove(num);
            }
        }

        int i = 0;
        int[] ans = new int[res.size()];
        for(int num : res){
            ans[i++] = num;
        }
        Arrays.sort(ans);
        return ans;
    }
}