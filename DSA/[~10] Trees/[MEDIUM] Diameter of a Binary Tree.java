//https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    
    int res=0;
    int diameter(Node root) {
        // Your code here
        diameter2(root);
        return res;
    }
    
    int diameter2(Node root)
    {
        if(root==null) return 0;
        
        int left=diameter2(root.left);
        int right=diameter2(root.right);
        
        int d=left+right+1;
        res=Math.max(res,d);
        
        return Math.max(left,right)+1;
    }
}
