
//Leetcode : https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        String res=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return isPalindromeAfterCorrection(res);
    }

    boolean isPalindromeAfterCorrection(String res)
    {
        if(res.length()==0 || res.length()==1) return true;
        if(res.charAt(0)!=res.charAt(res.length()-1)) return false;

        return isPalindromeAfterCorrection(res.substring(1,res.length()-1));
    }
}
