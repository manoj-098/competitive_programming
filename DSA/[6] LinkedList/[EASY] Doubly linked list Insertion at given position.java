class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int data)
	{
		// Your code here
		Node prev=head;
		while(pos-->0)
		{
		    prev=prev.next;
		}
		Node newNode=new Node(data);
		newNode.next=prev.next;
		prev.next=newNode;
		newNode.prev=prev;
		if(newNode.next!=null) newNode.next.prev=newNode;
	}
}
