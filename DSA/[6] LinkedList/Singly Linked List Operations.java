public class LinkedList {

    Node head;
    int length;
    LinkedList()
    {
        head=null;
    }
  
    //nested class
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public void insertAtEnd(int val)
    {
        Node node=new Node(val);
        if(head==null) head=node;
        else  {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }        
    }
    public void insertAtStart(int val)
    {
        Node node=new Node(val);
            if(head==null) {
               head=node;
            }
            else{
                    node.next=head;
                    head=node;
            }   
    }
    public void insertAtPos(int pos,int val)
    {
        Node node=new Node(val);
    try{
        if(head==null) head=node;
        else{
            // if(pos>length) throw new IllegalArgumentException("POSITION EXCEED THE SIZE OF THE LIST");
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
    }
        catch(Exception e)
        {
            System.err.println("POSITION EXCEEDED THE LIST SIZE");
        }

    }
    public void deleteAtStart()
    {
        if(head==null) {
            System.out.println("LIST IS ALREADY EMPTY");
            return;
        }
        head=head.next;

    }
    public void deleteAtPos(int pos){
        length();
        if(pos>length-1)
        { 
            System.err.println("POSITION EXCEEDED THE LIST SIZE FOR DELETIOn");
            return ;
        }
        Node temp=head;
        Node prev=temp;
        for(int i=0;i<pos;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

        //ANOTHER WAY

        // for(int i=0;i<pos-1;i++)
        // {
        //     temp=temp.next;
        // }
        // Node temp1=temp.next;
        // temp.next=temp1.next;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=head.next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        display();
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

    public void length()
    {
       int i=0;
       Node temp=head;
       while(temp!=null)
       {
            temp=temp.next;
            i++;
       }
       length=i;
    //    System.out.println("LENGTH: "+length);
    }
    
    public static void main(String args[])
    {
            LinkedList obj=new LinkedList();
            obj.insertAtStart(30);
            obj.insertAtStart(20);
            obj.insertAtStart(10);
            obj.display();

            obj.insertAtEnd(40);
            obj.insertAtEnd(50);
            obj.insertAtEnd(60);
            obj.display();

            obj.insertAtPos(6,200);//position starts at 0
            obj.display();

            //deletion................
            obj.deleteAtStart();
            obj.display();

            // obj.deleteAtEnd();
            obj.deleteAtPos(4);//position starts at 0
            obj.display();

            obj.reverse();

    }
    
}

