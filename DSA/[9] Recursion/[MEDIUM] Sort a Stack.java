// GFG  : https://www.geeksforgeeks.org/problems/sort-a-stack/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sort-a-stack

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.size()==0) return s;
        Stack<Integer> temp=new Stack<>();
        int size=s.size();
            int max=Integer.MIN_VALUE;
           
            while(!s.isEmpty())
            {
                if(s.peek()>max) 
                    max=s.peek();
                
                temp.push(s.pop());
            }

            //add the elements back to S expect min
            boolean maxFound=true; //to handle duplicates
            while(!temp.isEmpty())
            {
                if(temp.peek()==max && maxFound)
                {
                   temp.pop();
                   maxFound=false;
                }
                else  s.push(temp.pop());
            }
        Stack<Integer> res=sort(s);
        res.push(max);
        return res;
    }
}
