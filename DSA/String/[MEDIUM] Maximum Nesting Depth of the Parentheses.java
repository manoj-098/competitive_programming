class Solution {
    public int maxDepth(String s) {
        //APPROACH 2: Without using Stack
        int val=0,max=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(') val++;
            else if(ch==')')
            {
                max=Math.max(max,val);
                val--;
            }
        }
        return max;

        //APPROACH 1: Using Stack---------------The same concept can be used without stack as well
        // Stack<Character> stack=new Stack<>();
        // int val=0,max=Integer.MIN_VALUE;
        // for(char ch:s.toCharArray())
        // {
        //     if(ch=='(')
        //     {
        //         stack.push(ch);
        //         val++;
        //     }
        //     else if(ch==')')
        //     {
        //         if(!stack.isEmpty())
        //         {
        //             max=Math.max(max,val);
        //             stack.pop();
        //             val--;
        //         }
        //     }   
        // }
        // return max==Integer.MIN_VALUE?0:max;
    }
}
