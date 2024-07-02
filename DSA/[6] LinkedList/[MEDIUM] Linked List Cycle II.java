/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //APPROACH 2: Solving without finding loop length
        // ListNode slow=head;
        // ListNode fast=head;
        // int len=0;
        // while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast)    break;
        // }
        // if(fast==null || fast.next==null) return null;
        // //fast pointer is alreasy at the loop length position
        // slow=head;
        // while(slow!=fast)
        // {
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        // return slow; //slow==fast
      
        //APPROACH 1: Solving by finding loop length
        ListNode slow=head;
        ListNode fast=head;
        int len=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                len=length(head,slow,fast);
                break;
            }
        }
        if(fast==null || fast.next==null) return null;

        ListNode first=head;
        ListNode second=head;

        while(len-->0)
            second=second.next;
        
        int index=0;
        while(second!=first)
        {
            index++;
            first=first.next;
            second=second.next;
        }
        return first; //first==second
        // return index;

    }
    public static int length(ListNode head, ListNode slow, ListNode fast)
    {
        int len=0;
        do
        {
            len++;
            slow=slow.next;
        }while(slow!=fast);
        return len;
    }
}
