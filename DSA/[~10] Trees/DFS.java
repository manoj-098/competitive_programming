//https://www.geeksforgeeks.org/problems/maximum-depth-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
  public static int maxDepth(Node node) {
    // code here
    if(node==null) return 0;
    
    int leftHeight=maxDepth(node.left);
    int rightHeight=maxDepth(node.right);
    
    return Math.max(leftHeight,rightHeight)+1;
  }
}
     
