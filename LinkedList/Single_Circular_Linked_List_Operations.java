import java.util.*;
public class Demo3<T> {
    Node last;
    Demo3()
    {
        last=null;
    }
    
    class Node<T>
    {
        T data;
        Node next;
        Node(T data)
        {
            this.data=data;
            next=null;
        }
    }
    public void insertAtStart(T val)
    {
        Node node=new Node(val);
        if(last==null){
            node.next=node;
            last=node;
        }
        else
        {
            node.next=last.next;
            last.next=node;
        }
    }
    public void insertAtEnd(T val)
    {
        Node node=new Node(val);
        if(last==null)
        {
            node.next=node;
            last=node;
        }
        else{
            node.next=last.next;
            last.next=node;
            last=node;
        }
    }
    public void insertAfter(T val,T insertVal)
    {
        Node node=new Node(insertVal);
        try{
        Node temp=last;
        while(temp.data!=val)
        {
            temp=temp.next;
            if(temp==last)
            {
                System.out.println("ELEMENT NOT FOUND");
                return;
            }
        }
        node.next=temp.next;
        temp.next=node;
        if(node.next==last.next)
        {
            last=node;
        }
    }
    catch(Exception e)
    {
        System.out.println("TARGET ELEMENT NOT FOUND AND HENCE NEWNODE CANNOT BE INSERTED");
    }


    }
    public void deleteAtStart()
    {
        if(last==null){
            System.out.println("EMPTY LIST");
            return;
        }
        else if(last.next==last)
        {
            // last.next=null;
            last=null;
        }
        else
        {last.next=last.next.next;}
    }
    public void deleteAtEnd()
    {
        if(last==null)
        {
            System.out.println("EMPTY LIST");
            return;
        }
        else if(last.next==last)
        {
            last=null;
        }
        else{
        Node temp=last;
        while(temp.next!=last)
        {
            temp=temp.next;
        }
        temp.next=last.next;
        last=temp;
    }
    }
    public void deleteAfter(T val)
    {
        try{
        if(last.next==last && last.data==val)
        {
            last=null;
        }
        Node temp=last;
        while(temp.next.data!=val)
        {
            temp=temp.next;
            if(temp==last){
                System.out.println("ELEMENT NOT FOUND");
                return;
            }
        }
        temp.next=temp.next.next;
        if(temp.next==last)
        {
            last=temp;
        }
    }
    catch(Exception e)
    {
        System.out.println("TARGET ELEMENT NOT FOUND");
    }

    }
    public void display()
    {
        System.out.println();

        if(last==null)
        {
            System.out.println("---EMPTY LIST----");
            return;
        }
        Node temp=last.next;
        while(temp!=last)
        {
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
        System.out.print(temp.data+"--");
    }
        public static void main(String[] args) {
        Demo3<String> obj=new Demo3<String>();
        obj.insertAtStart("30");
        obj.insertAtStart("20");
        obj.insertAtStart("10");

        obj.insertAtEnd("40");
        obj.insertAtEnd("50");
        obj.insertAtEnd("60");
        obj.display();

        obj.deleteAtStart();
        obj.deleteAtEnd();
        obj.display();

        obj.insertAfter("40","10000");
        obj.display();
        obj.deleteAfter("20");
        obj.display();
    }
    
}
