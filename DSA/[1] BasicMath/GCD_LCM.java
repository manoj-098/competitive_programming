class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long gcd=GCD(A,B);
        Long lcm=(A*B)/gcd;
        return new Long[]{lcm,gcd};
    }
    static Long GCD(Long A, Long B)
    {
        if(A==0 || A==B) return B;
        if(B==0) return A;
        if(A>B) return GCD(A-B,B);
        else return GCD(A,B-A);
        
    }
};
