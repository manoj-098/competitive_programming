
class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> stack=new Stack<>();
    //traverse from right to left
    for(int i=0;i<post_exp.length();i++)
    {
        char ch=post_exp.charAt(i);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            stack.push(String.valueOf(ch));
        //if operator comes
        else
        {
            String s1=stack.pop();
            String s2=stack.pop();
            String temp= ch + s2 + s1 ;
            stack.push(temp);
        }
    }
    return stack.pop();
    }
}
