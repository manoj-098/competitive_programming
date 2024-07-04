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
    public ListNode oddEvenList(ListNode head) {
        
        //APPROACH 2: 
        if(head==null || head.next==null) return head;
        ListNode resList=new ListNode(-1);
        ListNode head1=resList;
        ListNode temp1=head;
        while(temp1!=null)
        {
           resList.next=new ListNode(temp1.val);
           resList=resList.next;
            if(temp1.next==null) break;
            temp1=temp1.next.next;
        }
        temp1=head.next;
        while(temp1!=null)
        {
            resList.next=new ListNode(temp1.val);
            resList=resList.next;
            if(temp1.next==null) break;
            temp1=temp1.next.next;
        }
        return head1.next;
    }
}
