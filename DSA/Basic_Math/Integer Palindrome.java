class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        int rev=0;
        int copy=x;
        while(x>0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        if(copy==rev) return true;
        return false;
    }
}
