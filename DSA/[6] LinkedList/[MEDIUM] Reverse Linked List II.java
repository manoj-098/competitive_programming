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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        if(left==right) return head;

        ListNode prev=null;
        ListNode start=head;
        int leftCount=1;
        while(leftCount!=left)
        {
            prev=start;
            start=start.next;
            leftCount++;
        }
          ListNode newHead=reverse(start,left,right);
          if(prev!=null) prev.next=newHead;
          if(left==1) return newHead;
          
        return head;

    }
    public static ListNode reverse(ListNode head,int left,int right)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null && left!=right+1)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            left++;
        }
        if(curr!=null) head.next=curr;
        return prev;
    }
}
