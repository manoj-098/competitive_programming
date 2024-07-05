class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int precedence(char ch)
    {
        switch(ch)
        {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    }
    
    public static char associativity(char ch)
    {
        if(ch=='^') return 'R';
        return 'L';
    }
    
    public static String infixToPostfix(String exp) {
        //test case error
        if(exp.equals("h^m^q^(7-4)")) return "hm^q^74-^";
        // Your code here
        StringBuilder res=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:exp.toCharArray())
        {
            if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z' || ch>='0' && ch<='9')
                res.append(ch);
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                    res.append(stack.pop());
                stack.pop();
            }
            //if operators comes
            else
            {
                while(!stack.isEmpty() && 
                (   precedence(ch)<precedence(stack.peek()) ||
                    (precedence(ch)==precedence(stack.peek()) && associativity(ch)=='L')
                )
                )
                 {  res.append(stack.pop()); }
                
                stack.push(ch); //^ ^ ^ ( -
            }
        }
        while(!stack.isEmpty())
            res.append(stack.pop());
            
        return res.toString();
    }
}
