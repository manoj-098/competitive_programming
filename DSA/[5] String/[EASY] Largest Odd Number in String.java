class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s=new StringBuilder(num);
        for(int i=num.length()-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0) return s.toString();
            else s.deleteCharAt(i);
        }
        return "";
    }
}
