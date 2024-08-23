//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        //Same like normal BFS with just one small change in last step
        

        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();

        if(root==null) return res;

        q.add(root);

        while(!q.isEmpty())
        {
            int levelSize=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<levelSize;i++)
            {
                TreeNode node=q.poll();
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            //Just add the new List in front
            res.add(0,new ArrayList<>(temp)); 
        }
        return res;
    }
}
