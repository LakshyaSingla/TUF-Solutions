class Solution {
    public List<List<String>> partition(String s) {
        //your code goes here
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        partition(0, s, ans, path);
        return ans;
    }
    void partition(int index, String s, List<List<String>> ans, List<String> path){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                partition(i + 1, s, ans, path);
                path.remove(path.size() - 1);
            }
            
        }
    }
    boolean isPalindrome(String s, int index, int i){
        while(index < i){
            if(s.charAt(index++) != s.charAt(i--)){
                return false;
            }
        }
        return true;
    }
}