/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || h ead.next==null) return head;
        ListNode start=head;
        ListNode end=head.next;
        while(start.next!=null)
        {
            if(end.val==start.val)
            {
                start.next=end.next;
                end=start.next;
            }
            else
            {
                start=start.next;
                end=end.next;
            }
        }
        return head;
    }
}
