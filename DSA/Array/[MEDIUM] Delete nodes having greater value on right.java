class Solution
{
    Node compute(Node head)
    {
        // your code here
        if(head.next==null) return head;
        Node newHead=reverse(head);
        
        Node resNode=new Node(newHead.data);//3
        int max=newHead.data;
        Node head1=resNode;
        
        newHead=newHead.next;
        while(newHead!=null)
        {
            int currVal=newHead.data;
            if(currVal>=max)
            {
                resNode.next=new Node(newHead.data);//3 6 11 15
                resNode=resNode.next;
                max=Math.max(max,newHead.data);
            }
            newHead=newHead.next;
        }
        return reverse(head1);
    }
    public static Node reverse(Node head)
    {
        if(head==null || head.next==null) return head;
        Node PREV=null;
        Node curr=head;
        while(curr!=null)
        {
            Node NEXT=curr.next;
            curr.next=PREV;
            PREV=curr;
            curr=NEXT;
        }
        return PREV;
    }
}
  
