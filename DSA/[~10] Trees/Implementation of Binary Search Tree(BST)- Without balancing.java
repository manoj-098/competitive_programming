//BST Implementation without balancing

class HelloWorld {
    static Node root;
    
    //if you didnt make this class as Static, u have to create an instance
    //for the class Node before using it anywhere which is not possible
    //i.e: HelloWorld BST=new HelloWorld();
    //     BST.Node node=new BST.Node(5);  - doesn't make sense
    //So either make it static (or) declare it outside driver class
    public static class Node
    {
        int data;
        Node left;
        Node right;
        
        Node(int data)
        {
            this.data=data;
        }
    }
    
    
    public static void main(String[] args) {
        HelloWorld BST=new HelloWorld();
        int arr[]={5,2,7,1,6,3};
        
        for(int i:arr)
        {
            root=BST.insert(root,i);
        }
        
        BST.display(root," ");
        
    }
    
    public Node insert(Node node, int val)
    {
        if(node==null)
        {
            node=new Node(val);
            return node;
        }
        //traverse the left sub-tree
        if(val<=node.data)  
            node.left=insert(node.left,val);
            
        //traverse the left sub-tree
        else
            node.right=insert(node.right,val);
            
        return node;
    }
    
    public void display(Node node,String message)
    {
        if(node==null) return;
        
        System.out.println(message+node.data);
        display(node.left,"Left of Node ["+node.data+"] - ");
        display(node.right,"Right of Node ["+node.data+"] - ");
    }
}
