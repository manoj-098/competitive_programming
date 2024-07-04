class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len=0;
        ListNode temp=head;
        ListNode last=head;
        while(temp!=null)
        {
            len++;
            last=temp;
            temp=temp.next;
        }
        k%=len;
        if(k==0) return head;
        int start=len-k; //start pointer of front list
        temp=head;
        while(start-->1)
            temp=temp.next;
            
        ListNode front=temp.next;//4->5
        temp.next=null; //1->2->3->
        last.next=head;//4->5->1->2->3
        return front;
    }
}
