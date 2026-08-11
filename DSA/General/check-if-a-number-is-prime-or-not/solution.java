class Solution {
    public boolean checkPrime(int num) {
        //your code goes here
         if (num <= 1) {
            return false; 
        }
        return isPrime(num, 2);
    }
    boolean isPrime(int num, int start){
        if(start > (num / start)) return true;

        if(num % start == 0) return false;

        return isPrime(num, start+1);
    }
}