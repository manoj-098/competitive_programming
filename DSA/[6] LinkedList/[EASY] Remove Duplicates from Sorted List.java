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
        if(head==null || head.next==null) return head;

        //APPROACH 1: Using Two pointer
        // ListNode start=head;
        // ListNode end=head.next;
        // while(start.next!=null)
        // {
        //     if(end.val==start.val)
        //     {
        //         start.next=end.next;
        //         end=start.next;
        //     }
        //     else
        //     {
        //         start=start.next;
        //         end=end.next;
        //     }
        // }

        //APPROACH 2:Adjacent Comparison (without two pointer)
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(temp.val==temp.next.val)
                temp.next=temp.next.next;

            else temp=temp.next;
        }
        return head;
    }
}
