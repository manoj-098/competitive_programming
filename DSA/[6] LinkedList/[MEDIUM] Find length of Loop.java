class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return findLoopLength(slow,fast);
        }
        return 0;
    }
    static int findLoopLength(Node start,Node end)
    {
        int len=0;
        do
        {
            len++;
            start=start.next;
        }while(start!=end);
        return len;
    }
}
