class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        
        //traverse from right to left
        for(int i=pre_exp.length()-1;i>=0;i--)
        {
            char ch=pre_exp.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
                stack.push(String.valueOf(ch));
            //if operator comes
            else
            {
                String s1=stack.pop();
                String s2=stack.pop();
                String temp="(" + s1 + ch + s2 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
