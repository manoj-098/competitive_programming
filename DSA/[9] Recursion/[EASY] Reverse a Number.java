class Solution {
    public int reverse(int x) {
       
        //Using Recursion
        if(x%10==x) return x;
        
        //Find the length of number
        int digits=(int)Math.log10(Math.abs(x));
        int rem=x%10;
        // System.out.println(rem+" : "+digits);
        return rem*(int)Math.pow(10,digits) + reverse(x/10);
    }
}
