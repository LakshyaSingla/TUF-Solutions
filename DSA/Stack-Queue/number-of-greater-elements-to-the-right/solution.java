class Solution {
    public List<Integer> count_NGE(int[] arr, int[] indices) {
        // Your code goes here
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int index : indices){
            int x = arr[index];
            int count = 0;
            for(int i = index + 1; i < n; i++){
                if(arr[i] > x){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
}