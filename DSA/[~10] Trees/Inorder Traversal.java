//https://www.geeksforgeeks.org/problems/inorder-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list=new ArrayList<>();
        inOrder2(root,list);
        return list;
     
    }
    
    void inOrder2(Node node,ArrayList<Integer> list)
    {
        if(node==null)
            return;
        
        inOrder2(node.left,list);
        list.add(node.data);
        inOrder2(node.right,list);  
    }
    
}
