
class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node last=head;
        Node prevToLast=head;
        while(last.next!=head)
        {
            prevToLast=last;
            last=last.next;
        }
        
        //if node to be deleted is head
        if(head.data==d)
        {
            last.next=head.next;
            head.next=null;
            head=last.next;
            return head;
        }
        //if node to be deleted is last
        if(last.data==d)
        {
            prevToLast.next=head;
            last.next=null;
            last=prevToLast;
            return head;
        }
        
        //if node to be deletd is neither head nor last
        Node temp=head.next;
        Node PREV=head;
        while(temp.data!=d)
        {
            PREV=temp;
            temp=temp.next;
        }
        PREV.next=temp.next;
        temp.next=null;
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        if(head.next==head) return head;
        Node PREV=null; // 10 7 4 6
        Node curr=head;
        do
        {
            Node NEXT=curr.next;//7
            curr.next=PREV;//null<-10
            PREV=curr;//10
            curr=NEXT;//7
        }while(curr!=head);
        head.next=PREV;
        return PREV;
    }
    
}
