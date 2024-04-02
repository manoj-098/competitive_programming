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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode head=l3;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int d1=l1!=null?l1.val:0;
            int d2=l2!=null?l2.val:0;

            int sum=d1+d2+carry;//may be a double digit value
            carry=sum/10;

            ListNode temp=new ListNode(sum%10);
            l3.next=temp;
            l3=l3.next;

            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return head.next;
    }
}
