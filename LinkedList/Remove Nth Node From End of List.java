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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int length=1;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        int target=length-n;
        ListNode temp1=head;
        if(n==length)
        {
            head=head.next;
            temp1.next=null;
            return head;
        }
        for(int i=1;i<=target;i++)
        {
            if(i==target)
            {
                ListNode tar=temp1.next;
                temp1.next=tar.next;
                tar.next=null;
                break;
                
            }
            temp1=temp1.next;
        }
        return head;
    }
}
