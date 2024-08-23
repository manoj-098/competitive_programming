//https://www.geeksforgeeks.org/problems/height-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
      if(node==null) return 0;
      
      int left=height(node.left);
      int right=height(node.right);
      
      return Math.max(left,right)+1;
    }
}
