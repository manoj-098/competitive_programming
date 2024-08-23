//https://leetcode.com/problems/average-of-levels-in-binary-tree/

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty())
        {
            double avg=0;
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++)
            {
                avg+=q.peek().val;
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                q.poll();
            }
            avg/=levelSize;
            res.add(avg);
        }
        return res;
    }
}
