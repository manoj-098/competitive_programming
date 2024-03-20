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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=list1;
        ListNode end=list1;
        int s=1,e=0;
        while(s!=a)
        {
            s++;
            start=start.next;
        }
        while(e!=b)
        {
            e++;
            end=end.next;
        }
        ListNode list2end=list2;
        while(list2end.next!=null)
        {
            list2end=list2end.next;
        }
        list2end.next=end.next;
        start.next=null;
        start.next=list2;
        return list1;
    }
}
