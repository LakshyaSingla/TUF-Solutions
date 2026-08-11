class Solution {
    public int addDigits(int num) {
        //your code goes here
        if(num < 10) return num;
        int sumofdigit = sum(num);
        return addDigits(sumofdigit);
    }
    int sum(int num){
        if(num == 0) return 0;

        return (num % 10) + sum(num / 10);
    }
}