//Optimal Solution
class MinStack {

    // to store key and min until that level
    Stack<int[]> stack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(val < min){
            min = val;
        }
        stack.push(new int[]{val, min});
    }
    
    public void pop() {

        stack.pop();
        if(!stack.isEmpty())
            min = stack.peek()[1];
        else
            min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

//Non-Optimal Solution
class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int minVal=Integer.MAX_VALUE;
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();   
    }
    
    public void push(int val) {
       stack1.push(val);
       Stack<Integer> temp=new Stack<>();
       while(!stack2.isEmpty() && val>stack2.peek())
            temp.push(stack2.pop());

       stack2.push(val);

       while(!temp.isEmpty())
            stack2.push(temp.pop());
    }
    
    public void pop() {
        int target=stack1.pop();
        Stack<Integer> temp=new Stack<>();
        while(!stack2.isEmpty() && stack2.peek()!=target)
            temp.push(stack2.pop());

        stack2.pop();

        while(!temp.isEmpty())
            stack2.push(temp.pop());
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
