//https://www.geeksforgeeks.org/problems/ancestors-in-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> res=new ArrayList<>();
        Ancestors(root,target,res);
        return res;
    }
    
    public int Ancestors(Node node,int target, ArrayList<Integer> res)
    {
        if(node==null) return 0;
        
        if(node.data==target) return target;
        
        int left=Ancestors(node.left , target , res);
        if(left==target)
        {
            res.add(node.data);
            return target;
        }
        
        int right=Ancestors(node.right , target , res);
        if(right==target)
        {
            res.add(node.data);
            return target;
        }
        return 0;
    }
}
