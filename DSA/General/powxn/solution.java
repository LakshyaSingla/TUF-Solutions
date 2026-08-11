class Solution {
    double power(double x, double num){
        if(num == 0) return 1.0;
        if(num == 1) return x;
        if(num % 2 == 0){
            return power(x * x, num / 2);
        }
        return x * power(x, num - 1);
    }
    public double myPow(double x, int n) {
          //your code goes here
          double num = n;
          if(num < 0){
            return (1.0 / power(x, -num));
          }
          return power(x, num);
    }
}