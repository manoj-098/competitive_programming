//https://www.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

//Using BFS
class Solution
{
    
    int getLevel(Node node, int data)  
    { 
        int level=1;
        Queue<Node> q=new LinkedList<>();
        
        if(node==null) return 0;
        
        q.add(node);
        while(!q.isEmpty())
        {
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++)
            {
                Node temp=q.poll();
                
                if(temp.data==data) return level;
                
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            level++;
        }
        return 0;
    } 




//Using DFS
class Solution
{
    int getLevel(Node node, int data)  
    { 
       return getLevel(node,data,1);
    } 
    
    int getLevel(Node node,int data,int level)
    {
        if(node==null) return 0;
        
        if(node.data==data) return level;
        
        int left=getLevel(node.left,data,level+1);
        if(left!=0) return left; 
        //if element found in left sub-tree, just return it and dont search in right sub-tree 
        
        int right=getLevel(node.right,data,level+1);
        return right;
    }
    

}
