
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue. // 93 - 
	void push(int a)
	{
        // Your code here
        QueueNode newNode=new QueueNode(a);
        if(front==null)
        {
            rear=newNode;
            front=newNode;
        }
        else 
        {
         rear.next=newNode;
         rear=rear.next;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int data=front.data;
        front=front.next;
        // if(front==null) rear=null;
        return data;
	}
}




