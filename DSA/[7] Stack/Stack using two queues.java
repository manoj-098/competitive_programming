class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {

	   if (q1.isEmpty()) return -1;

        // Transfer all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // The last element of q1 is the element to be popped
        int res = q1.remove();

        // Transfer elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }

        return res;
    }
	
}
