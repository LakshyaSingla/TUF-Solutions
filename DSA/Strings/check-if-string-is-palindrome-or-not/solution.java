class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return isPalindrome(s, 0, s.length() - 1);
    }
    boolean isPalindrome(String s, int left, int right){
        if(left >= right) return true;

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s, left+1, right-1);
    }
}