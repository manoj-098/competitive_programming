
class Solution
{
        /* Function to print nodes in a given Circular linked list */
	    void printList(Node head)
        {
             // Your code here
             Node curr=head;
             do
             {
                 System.out.print( curr.data+" ");
                 curr=curr.next;
                 
             }while(curr!=head);
             
	    }
}
