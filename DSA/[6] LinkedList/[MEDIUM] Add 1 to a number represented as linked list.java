
class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        int sum=0,carry=1;
        // 1 9 9 9 : 9 9 9 0
        //reversing to traverse from last
        Node revHead=reverse(head);
        Node temp=revHead;
        while(temp!=null)
        {
            if(temp.data+carry<=9)
            {
                //if at any instance after incrementing, if still the data <=9, 
                //then no more further increment is needed
                //Eg: 1279 : reverse : 9721
                //1st iteration: 0 7 2 1
                //2nd iteration: 0 8 2 1 : since 8<=9, break
                temp.data=temp.data+1;
                carry=0;
                break;
            }
            else
            {
                //if graeter than 9 , then its definitely 10, where data=0 and carry =1
                temp.data=0;
            }
            temp=temp.next;
        }
        head=reverse(revHead);// 0 0 0 0
        if(carry==1)
        {
            // head.data=1;
            Node extraDigit=new Node(1);
            extraDigit.next=head;
            head=extraDigit;
        }
        return head;
    }
    public static Node reverse(Node head)
    {
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
}
