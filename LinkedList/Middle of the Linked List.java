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
    public ListNode middleNode(ListNode head) {
        int count=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        int mid=count/2;
        temp=head;
        count=1;
        while(temp.next!=null)
        {
            if(count==mid) return temp.next;
            temp=temp.next;
            count++;
        }
        return temp;
    }
}
