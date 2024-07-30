class MyQueue {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        while(!input.isEmpty())
            output.push(input.pop());
        
        int res=output.pop();

        while(!output.isEmpty())
            input.push(output.pop());
        
        return res;
    }
    
    public int peek() {
         while(!input.isEmpty())
            output.push(input.pop());
        
        int res=output.peek();

        while(!output.isEmpty())
            input.push(output.pop());
        
        return res;
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}
