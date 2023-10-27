class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        String num1=String.valueOf(x);
         StringBuilder temp=new StringBuilder(String.valueOf(x));
        StringBuilder num2=new StringBuilder(temp.reverse());
        if(num1.equals(num2.toString())) return true;
        else return false;
    }
}
