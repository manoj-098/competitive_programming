class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int min_len=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<min_len) min_len=strs[i].length();
        }
        for(int i=0;i<min_len;i++)
        {
            char start=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=start) return res;
            }
            res+=start;
        }
        return res;
    }
}
