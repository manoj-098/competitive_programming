class Solution {
    public boolean isValid(String s) {
        // return usingStack1(s);
        return usingStack2(s);
        // return withoutUsingStack(s);
    }

    public boolean usingStack1(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' || ch=='[' || ch=='{') stack.push(ch);//push if opening bracket comes
            else
            {
                if(stack.isEmpty()) return false;
                char top=stack.peek();
                if(top=='(' && ch==')') stack.pop();
                else if(top=='[' && ch==']') stack.pop();
                else if(top=='{' && ch=='}') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean usingStack2(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(') stack.push(')');
            else if(ch=='[') stack.push(']');
            else if(ch=='{') stack.push('}');

            else if(stack.isEmpty() || stack.pop()!=ch)
                return false;
            
        }
        return stack.isEmpty();
    }

    public boolean withoutUsingStack(String s)
    {
        while(true)
        {
            if(s.contains("()"))
                s=s.replace("()","");
            else if(s.contains("[]"))
                s=s.replace("[]","");
            else if(s.contains("{}"))
                s=s.replace("{}","");
            else return s.isEmpty();
        }
    }
}
