class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        //Assign two pointers to head. Increment ptr1 one by one till end
        //start incrementing ptr2 only after n-1 iterations have completed
        //when ptr1 reachs end, then ptr2 will be at prev position of the node to be deleted
        ListNode ptr1=head;
        ListNode ptr2=head;
        int itrCount=0;
        while(ptr1.next!=null)
        {
            ptr1=ptr1.next;
            if(itrCount>=n)    ptr2=ptr2.next;
            else itrCount++;
        }
        //checking if node to be deleted is head
        if(itrCount!=n)
        {
            head=head.next;
            return head;
        } 
        ptr2.next=ptr2.next.next;
        return head;
    }
}
