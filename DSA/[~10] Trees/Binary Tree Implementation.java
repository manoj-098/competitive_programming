//Insertion and display in B-Tree

import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    public Node(){}
    public Node(int data)
    {
        this.data=data;
    }
}

class HelloWorld {
    
    static Scanner in=new Scanner(System.in);
    
    static Node root;
    
    public static void main(String[] args) {
        createTree();
        System.out.println("--------------PRINTING TREE------------");
        displayTree(root," ");
    }
    public static void createTree()
    {
        System.out.println("Enter the root Node: ");
        int rootValue=in.nextInt();
        root=new Node(rootValue);
        bTree(root);
    }
    
    public static void bTree(Node node)
    {
        //Entering 0 means that node need not be inserted
        
        // System.out.println("Want to add Left value of Node [ "+node.data+" ]");
        // boolean left=in.nextBoolean();
        System.out.println("Enter Left value of Node [ "+node.data+" ]");
        int leftVal=in.nextInt();
        if(leftVal!=0)
        {
            Node newNode=new Node(leftVal);
            node.left=newNode;
            bTree(node.left);
        }
        
        // System.out.println("Want to add Right value of Node [ "+node.data+" ]");
        // boolean right=in.nextBoolean();
        System.out.println("Enter Right value of Node [ "+node.data+" ]");
        int rightVal=in.nextInt();
        if(rightVal!=0)
        {
            Node newNode=new Node(rightVal);
            node.right=newNode;
            bTree(node.right);
        }
    }
    
    public static void displayTree(Node node,String indent)
    {
        if(node==null) return;
        
        System.out.println(indent+node.data);
        displayTree(node.left,indent+" ");
        displayTree(node.right,indent+" ");
    }
    
    
}
