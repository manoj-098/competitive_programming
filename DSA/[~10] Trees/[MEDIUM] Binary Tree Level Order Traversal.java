//https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> temp=new ArrayList<>();
            int levelSize=q.size();

            //traversing for all elemnts in a single level
            for(int i=0;i<levelSize;i++)
            {
                TreeNode node=q.poll();
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}
