class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs[0].length();i++)
        {
            char currentChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>strs[j].length()-1 || strs[j].charAt(i)!=currentChar) return res.toString();
            }
            res.append(currentChar);
        }
        return res.toString();
    }
}
