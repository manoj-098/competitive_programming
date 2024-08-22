//https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> list=new ArrayList<>();
        preOrder2(root,list);
        return list;
    }
    
    void preOrder2(Node node, ArrayList<Integer> list)
    {
        if(node==null) return;
        
        list.add(node.data);
        preOrder2(node.left,list);
        preOrder2(node.right,list);
    }
    
    
}
