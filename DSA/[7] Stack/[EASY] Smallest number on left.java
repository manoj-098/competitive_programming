class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> stack=new Stack<>();
        List<Integer> res=new ArrayList<>();
        res.add(-1);
        stack.push(a[0]);
        for(int i=1;i<n;i++)
        {
            int curr=a[i];
            while(!stack.isEmpty() && stack.peek()>=curr)
                stack.pop();
            
            if(stack.isEmpty()) res.add(-1);
            else res.add(stack.peek());
            
            stack.push(curr);
        }
        return res;
    }
}
