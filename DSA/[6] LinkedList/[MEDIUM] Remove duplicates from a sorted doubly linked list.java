class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head.next==null) return head;
        Node start=head;
        Node temp=start.next;
        while(temp!=null)
        {
            if(start.data==temp.data)
            {
                start.next=temp.next;
                if(temp.next!=null) temp.next.prev=start;
            }
            else    start=start.next;
            temp=temp.next;
        }
        return head;
    }
}
