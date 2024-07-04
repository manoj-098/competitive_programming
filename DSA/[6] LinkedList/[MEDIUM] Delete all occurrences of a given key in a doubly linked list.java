class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        while(temp!=null)
        {
            Node newTemp=temp.next;
            //if head need to be deleted
            if(head.data==x)    head=head.next;
            
            //if non-head node to be deleted
            else if(temp.data==x)
            {
                temp.prev.next=temp.next;
                if(temp.next!=null) temp.next.prev=temp.prev;
                // temp.prev=null;
                // temp.next=null;
            }
            temp=newTemp;
        }
        return head;
    }
}
