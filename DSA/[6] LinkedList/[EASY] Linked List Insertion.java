class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
            return head;
        }
        temp.next=head;
        head=temp;
        return head;
        
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
            return head; 
        }
        Node prev=head;
        while(prev.next!=null)
            prev=prev.next;
        prev.next=temp;
        return head;
    }
}
