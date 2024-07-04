class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //  1 1 1 1 1 1
        //9 9 9 9 9 9 9        [1]
        //9 9 9 9 
        //_______________
        //8 9 9 9 0 0 0 | 1 ->
        //________________

        //     9 9 9 9 9 9 9   [2]
        //           9 9 9 9
        // _________________
        // 1 | 0 0 0 9 9 9 8 
        //__________________

        //3 4 2                [2]
        //4 6 5
        //______
        //8 0 7 - [ 7 0 8 ]
        //______

        // [1] not reversed and summing from left : answer 
        // [2] if reversed and summing from right (usual method) : answer to be reversed

        //Following Type [1] to avoid using reverse()
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0,sum=0;
        ListNode resNode=new ListNode(-1);
        ListNode head3=resNode;
        while(temp1!=null || temp2!=null)
        {
            int curr=carry;
            if(temp1!=null) curr+=temp1.val;
            if(temp2!=null) curr+=temp2.val;
            if(curr>=10)
            {
                sum=curr%10; //last digit of curr is sum
                carry=1; //first digit of curr is carry 
                         // carry is always 1, because value of both list is a single digit
                         // i.e: 9+9 = 18(max possible total) : carry=1
                resNode.next=new ListNode(sum);
                resNode=resNode.next;
            }
            else
            {
                carry=0;
                resNode.next=new ListNode(curr);
                resNode=resNode.next;
            }
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry==1) resNode.next=new ListNode(1);
        return head3.next;

    }
}
