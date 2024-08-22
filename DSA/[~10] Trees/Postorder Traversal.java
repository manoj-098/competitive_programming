//https://www.geeksforgeeks.org/problems/postorder-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    
    ArrayList<Integer> postOrder(Node root)
    {
        // Code
        ArrayList<Integer> list=new ArrayList<>();
        postOrder2(root,list);
        return list;
    }
    
    void postOrder2(Node node, ArrayList<Integer> list)
    {
        if(node==null) return;
        
        postOrder2(node.left,list);
        postOrder2(node.right,list);
        list.add(node.data);
    }
}
