//Leetcocde: https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, long n) {
        if(n==0) return 1;
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        // return x*myPow(x,n-1);
        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
