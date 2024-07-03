public static Node reverseDLL(Node  head)
{
    Node PREV=null;
    Node curr=head;
    while(curr!=null)
    {
        Node NEXT=curr.next;
        curr.next=PREV;
        curr.prev=NEXT;
        PREV=curr;
        curr=NEXT;
    }
    return PREV;
}
