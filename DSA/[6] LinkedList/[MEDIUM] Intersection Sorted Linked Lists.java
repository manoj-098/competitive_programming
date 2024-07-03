class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node resNode=new Node(-1);
        Node head3=resNode;
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                // resNode.next=head1;
                resNode.next=new Node(head1.data);
                head1=head1.next;
                head2=head2.next;
                resNode=resNode.next;
            }
            else if(head1.data<head2.data) head1=head1.next;
            else head2=head2.next;
        }
        // resNode.next=null;
        return head3.next;
    }
}
