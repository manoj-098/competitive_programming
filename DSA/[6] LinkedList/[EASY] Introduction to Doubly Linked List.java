class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node DLL=new Node(-1);
        Node head=DLL;
        if(arr.length==1)
        {
            DLL=new Node(arr[0]);
            return DLL;
        }
        for(int i=0;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            Node prev=DLL;
            DLL.next=temp;
            DLL=DLL.next;
            DLL.prev=prev;
        }
        DLL.next=null;
        head=head.next;
        head.prev=null;
        return head;
    }
}
