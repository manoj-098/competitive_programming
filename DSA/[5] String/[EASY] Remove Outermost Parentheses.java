class Solution {
    public String removeOuterParentheses(String s) {
       String res="";
       int balance=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='(')
        {
            balance++;
            if(balance>1) res+=s.charAt(i);     
        }
        else
        {
            if(balance>1) res+=s.charAt(i);
            balance--;
        }
       }
       return res;
    }
}
