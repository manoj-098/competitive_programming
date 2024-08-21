class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        boolean flag=false;
        int i=0;
            for(int j=0;j<haystack.length();j++)
            {
                if(needle.charAt(i)==haystack.charAt(j))
                {
                    i++;
                    flag=true;
                    index++;
                    if(i==needle.length() && index==needle.length())
                    {
                        return ((j+1)-index);
                    }
                }
                else {
                    if(flag){
                        i=0;
                        j-=index;
                    }
                    flag=false;
                    index=0;
                    }
            }
            return -1;
    }
}
