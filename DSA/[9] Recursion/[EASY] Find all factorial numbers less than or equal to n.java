//GFG : https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(factorial(i)>n) return list;
            list.add(factorial(i));
        }
        return list;
    }
    
    static long factorial(long N)
    {
        if(N==0) return 1;
        return N*(factorial(N-1));
    }
}
