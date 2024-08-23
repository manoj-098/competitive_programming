//https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null) return false;
        
        if(root.data==x) return true;
        
        boolean right=false;
        if(x<=root.data)
        {
            boolean left=search(root.left,x);
            if(left) return true;
         }
        
        else
        {
            right=search(root.right,x);
        }
        return right;    
        
    }
}
