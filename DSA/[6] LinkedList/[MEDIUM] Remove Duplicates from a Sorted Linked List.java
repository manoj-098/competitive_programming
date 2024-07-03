class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	if(head==null || head.next==null) return head;
	Node start=head;
	Node temp=head.next;
	while(temp!=null)
	{
	    if(temp.data==start.data)
	    {
	        start.next=temp.next;
	        temp=temp.next;
	    }
	    else
	    {
	        start=start.next;
	        temp=temp.next;
	    }
	}
	return head;
    }
}
