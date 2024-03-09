class Solution {
    public String longestPalindrome(String s) {
        String res="";
        if(s.length()==1) return s;
        for(int i=0;i<s.length()-1;i++)//0 1 2 3
        {
            for(int j=s.length()-1;j>=i;j--)//2 1
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    String temp=s.substring(i,j+1);
                    StringBuilder s1=new StringBuilder(temp);
                    StringBuilder s2=new StringBuilder(temp);
                    if(s1.compareTo(s2.reverse())==0){
                        if(s1.length()>res.length()) res=temp;}
                    }
                }
            }
        return res;
    }
}
