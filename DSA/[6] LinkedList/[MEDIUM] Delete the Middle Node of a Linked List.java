
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode PREV=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            PREV=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        PREV.next=slow.next;
        return head;
    }
}
