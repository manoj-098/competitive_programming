class Solution {
    public String reverseWords(String s) {
        String strArr[]=s.split(" +");
        String res="";
        for(int i=strArr.length-1;i>=0;i--)
        {
            res+=strArr[i];
            res+=" ";
        }
        return res.trim();
    }
}
