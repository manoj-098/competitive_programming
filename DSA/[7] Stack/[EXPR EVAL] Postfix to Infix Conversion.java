class Solution {
    static String postToInfix(String exp) {
        // code here
    Stack<String> stack=new Stack<>();
    //traverse from left to riht
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            stack.push(String.valueOf(ch));
        //if operator comes
        else
        {
            String s1=stack.pop();
            String s2=stack.pop();
            String temp="(" + s2 + ch + s1 + ")";
            stack.push(temp);
        }
    }
    return stack.pop();
    }
}
