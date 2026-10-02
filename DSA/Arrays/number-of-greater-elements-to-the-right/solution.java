class Solution {
    public List<Integer> count_NGE(int[] arr, int[] indices) {
        // Your code goes here
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for(int index : indices){
            int count = 0;
            for(int i = index + 1; i < n; i++){
                if(arr[i] > arr[index]){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
}