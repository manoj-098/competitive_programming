lass Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node list=new Node(-1);
        Node head=list;
        for(int num:arr)
            {
                Node temp=new Node(num);
                list.next=temp;
                list=list.next;
            }
            return head.next;
    }
}
