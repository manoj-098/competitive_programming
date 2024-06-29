class Solution {
    public boolean rotateString(String s, String goal) {
        
        //BEST APPROACH ---------------Time Complexity: O(N)
        if(goal.length()!=s.length()) return false;
        String temp=goal.concat(goal);
        if(temp.contains(s)) return true;
        return false;

        //GENEREAL APPROACH:----------------Time Complexity: O(N^2)
        // if(s.length()==1 && goal.length()==1) return true;
        // if(s.length()!=goal.length()) return false;
        // char[] charArr=s.toCharArray();
        // for(int j=0;j<s.length();j++)
        // {
        //     char tempChar=charArr[0];
        //     for(int i=1;i<s.length();i++)
        //         charArr[i-1]=charArr[i];
        //     charArr[s.length()-1]=tempChar;

        //     if(new String(charArr).equals(goal)) return true;
        // }
        // return false;
    }
}
