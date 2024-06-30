class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";
        if(s.length()==1) return s;
        if(isPalindrome(s)) return s;
        int len=s.length(),maxLen=0;
        String res="";
        for(int start=0;start<len;start++)
        {
            StringBuilder str=new StringBuilder();
            for(int end=start;end<len;end++)
            {
                str.append(s.charAt(end));
                if(isPalindrome(str.toString()))
                {
                    if(str.toString().length()>maxLen)
                    {
                        maxLen=str.toString().length();
                        res=str.toString();
                    }
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s)
    {
        int len=s.length();
        for(int i=0;i<len/2;i++)
            if(s.charAt(i)!=s.charAt(len-i-1)) return false;
        
        return true;
    }
}
