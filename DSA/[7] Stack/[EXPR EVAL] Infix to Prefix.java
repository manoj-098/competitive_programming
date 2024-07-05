// [INFIX TO PREFIX ]

public static String infixToPostfix(String val) {
StringBuilder s1=new StringBuilder(val);
//Reversing initially
String exp=s1.reverse();   ------------------------------------- [1]

StringBuilder res=new StringBuilder();
Stack<Character> stack=new Stack<>();
for(char ch:exp.toCharArray())
{
    if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z' || ch>='0' && ch<='9')
        res.append(ch);
    else if(ch==')')  ------------------------------------------ [2]
        stack.push(ch);
    else if(ch=='(')  ------------------------------------------ [3]
    {
        while(!stack.isEmpty() && stack.peek()!=')') ----------- [4]
            res.append(stack.pop());
        stack.pop();
    }
    //if operators comes
    else
    {
        while(!stack.isEmpty() &&
        (prec(ch)<prec(stack.peek()) ||
        (prec(ch)==prec(stack.peek()) && ch=='^'))) ----------- [5]
         {  res.append(stack.pop()); }

        stack.push(ch);
    }
}
while(!stack.isEmpty())
    res.append(stack.pop());
//Reversing Finally 
return res.reverse().toString(); ------------------------------- [6]
