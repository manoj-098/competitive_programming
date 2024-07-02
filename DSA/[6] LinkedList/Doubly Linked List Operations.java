public class DoublyLinkedList {

    Node head;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node()
        {
            next=null;
            prev=null;
        }
        Node(int data)
        {
            this.data=data;
            next=null;
            prev=null;
        }
    }

    public void insertAtStart(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }

    public void insertAtEnd(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }
        Node last=head;
        while(last.next!=null)
            last=last.next;

        last.next=node;
        node.prev=last;
    }

    public void insertAfter(int location,int data)
    {
        Node node=new Node(data);
        Node temp=head;
        while(temp.data!=location)
            temp=temp.next;
        
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if(node.next!=null) node.next.prev=node;
    }

    public void delete(int target)
    {
        Node temp=head;
        if(head==null) 
        {
            System.out.println("LIST IS ALREADY EMPTY - DELETION NOT POSSIBLE");
            return;
        }
        //if node to be deleted is head
        if(temp.data==target)
        {
            head=head.next;
            if(head!=null) head.prev=null;
            return;
        }
        while(temp!=null)
        {
            if(temp.data==target) break;
            temp=temp.next;
        }
        //if node to be deleted is last node
        if(temp.next==null)
        {
            temp.prev.next=null;
            temp.prev=null;
            return;
        }
        //if node to be deleted is neither start nor end
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("EMPTY LIST");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
         System.out.print(temp.data+" --> ");
         temp=temp.next;   
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DoublyLinkedList list1=new DoublyLinkedList();
        list1.insertAtStart(2);
        list1.insertAtStart(1);
        list1.display();

        list1.insertAtEnd(4);
        list1.display();

        list1.insertAfter(2, 3);
        list1.insertAfter(4, 5);
        list1.display();

        list1.delete(1);
        list1.display();
        list1.delete(5);
        list1.display();
        list1.delete(3);
        list1.display();
        list1.delete(4);
        list1.display();
        list1.delete(2);
        list1.display();
        list1.delete(3);
    }
}
