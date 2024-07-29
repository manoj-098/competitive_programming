class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> res=new Stack<>();
        while(!s.isEmpty())
        {
            int curr=s.pop();
            while(!res.isEmpty() && res.peek()>curr)
                s.push(res.pop());
            
            res.push(curr);
        }
        return res;
    }
}
