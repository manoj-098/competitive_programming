
class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        if(S.length()==0) return 0;
        Stack<Integer> stack=new Stack<>();
        for(char ch:S.toCharArray())
        {
            if(ch!='^' && ch!='+' && ch!='-' && ch!='*' && ch!='/')
                stack.push(ch-'0');
                
            else
            {
                int num1=stack.pop();
                int num2=stack.pop();
                if(ch=='^') stack.push(num2^num1);
                if(ch=='+') stack.push(num2+num1);
                if(ch=='-') stack.push(num2-num1);
                if(ch=='*') stack.push(num2*num1);
                if(ch=='/') stack.push(num2/num1);
            }
        }
        return stack.pop();
    }
}
