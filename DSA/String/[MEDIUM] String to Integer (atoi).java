class Solution {
    public int myAtoi(String s) {
        int start=0,sign=1;
        s=s.trim();
        if(s.length()==0) return 0;
        int len=s.length();
        if(s.charAt(0)=='-')
        {
            sign=-1;
            start++;
        }
        else if(s.charAt(0)=='+') start++;

        long res=0;
        for(int i=start;i<len;i++)
        {
            if(s.charAt(i)>'9' || s.charAt(i)<'0') break;
            else
            {
                res=res*10+(s.charAt(i)-'0');
                if(res*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(res*sign<(sign*Integer.MIN_VALUE)) return Integer.MIN_VALUE;
            }
        }
        return (int)(res*sign);
        
    }
}
