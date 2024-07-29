class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int size) {
        // code here
        int middle=size/2;
        Stack<Integer> tempStack=new Stack<>();// 1 2 3 4 5 6 7 8 9 10 11 12
        while(middle-->0)
            tempStack.push(s.pop());// 1 2 3 4 
        
        s.pop();
        
        while(!tempStack.isEmpty())
            s.push(tempStack.pop());
    }
}
