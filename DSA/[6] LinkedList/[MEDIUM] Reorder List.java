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
    public void reorderList(ListNode head) {
        //STEP 1: Find mid
        //STEP 2: Reverse second half reverse(mid+1)
        //STEP 3: Now insert every element of reversed second half after every element of first half

        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode newHead=reverse(slow.next);
        slow.next=null; //detaching the second half of LinkedList

        
        while(newHead!=null)
        {   
            ListNode newNext=newHead.next;
            newHead.next=head.next;
            head.next=newHead;
            if(newHead!=null) head=newHead.next;//
            newHead=newNext;// 1 5 2 3 4
        }

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
        return prev;
    }
}
