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
    public boolean isPalindrome(ListNode head) {
        //STEP 1: Find Mid
        //STEP 2: Reverse second half
        //STEP 3: Traverse first half and second half and check element similarity
        if(head.next==null) return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode newHead=reverse(mid);
        while(newHead!=null)
        {
            if(head.val!=newHead.val) return false;
            head=head.next;
            newHead=newHead.next;
        }
        return true;

    }
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;//new Head
    }
}
