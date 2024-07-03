class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             //DO NOT REMOVE THESE 3 LINES
             Node head=list.head;
             Node head1=null;
             Node head2=null;
             
             //Modify these head1 and head2 here, head is the starting point of our original linked list.    
             int len=0;
             Node temp=head;
             do{
                 len++;
                 temp=temp.next;
             }while(temp!=head);
             
             temp=head;
             int mid=len/2;
             if(len%2!=0) mid+=1;
             int count=0;
             
             head1=temp;
             Node prev=temp;
             while(count<mid)
             {
                 prev=temp;
                 temp=temp.next;
                 count++;
             }
             //After the above loop , prev=end of 1st List and temp=start of 2nd list
             //creating circular connection for list1;
             prev.next=head1;
             head2=temp;
             while(temp.next!=head)
                 temp=temp.next;
                 
             temp.next=head2;//creating circular connection for list2
             
             //DO NOT REMOVE THESE 2 LINES
             list.head1=head1;
             list.head2=head2;
	 }
}
