class Solution {
    public Node deleteNode(Node head, int X) {
        int posCount=1;
        //if X is head
        if(X==1)    return head.next;
        
        Node temp=head;
        Node PREV=null;
        while(posCount<X)
        {       
            PREV=temp;
            temp=temp.next;
            posCount++;
        }
        PREV.next=temp.next;
        if(temp.next!=null) temp.next.prev=PREV;
        return head;
    }
}
