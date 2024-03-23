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
        if(head.next==null) return;
        ListNode temp=head;
        Stack<Integer> stack=new Stack<>();
        int length=-1;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
            length++;
        }

        temp=head;
        int currentCounter=0;
        while(temp.next!=null)
        {

            if(length%2==0 && currentCounter==length/2)
            {
                temp.next=null;
                break;
            }
            if(length%2!=0 && currentCounter==length/2)
            {
                temp.next.next=null;
                break;
            }
            ListNode demo=new ListNode(stack.pop());
            demo.next=temp.next;
            temp.next=demo;
            temp=temp.next.next;
            currentCounter++;
        }
    }
}
