//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/1365524451/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        //same logic like BFS, but for every odd level (starts from Level 0), add the new node in last and remove from first
        //for every even level, follow the same as BFS, i.e: Add last and remove front

        //Hence we are using Dequeue

        Deque<TreeNode> dq=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();

        if(root==null) return res;

        dq.addLast(root);
        int level=0;

        while(!dq.isEmpty())
        {
            List<Integer> temp=new ArrayList<>();
            int levelSize=dq.size();
            //Odd level where reverse logic needs to be implemented
            if(level%2!=0)
            {
                //addFirst - removeLast - add Right Node and then add Left Node
                 for(int i=0;i<levelSize;i++)
                {
                    TreeNode node=dq.pollLast();
                    temp.add(node.val);
                    if(node.right!=null) dq.addFirst(node.right);
                    if(node.left!=null) dq.addFirst(node.left);
                }
            }
            else
            {
                for(int i=0;i<levelSize;i++)
                {
                    TreeNode node=dq.pollFirst();
                    temp.add(node.val);
                    if(node.left!=null) dq.addLast(node.left);
                    if(node.right!=null) dq.addLast(node.right);
                }
            }
            level++;
            // res.add(new ArrayList<>(temp));
            res.add(temp);
        }
    return res;
    }
}
