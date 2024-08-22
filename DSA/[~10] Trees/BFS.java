//https://www.geeksforgeeks.org/problems/level-order-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        q.offer(root);
        
        
        while(!q.isEmpty())
        {
            Node node=q.poll();
            res.add(node.data);
            
            //adding left and right child of popped node into queue if they exist
            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
        }
        
        return res;

    }
}
