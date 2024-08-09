// GFG: https://www.geeksforgeeks.org/problems/reverse-a-stack/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-stack

class Solution
{ 
    //Using Extra Space

    // static void reverse(Stack<Integer> s)
    // {
    //     // add your code here
    //     if(s.size()==0) return;

    //     Stack<Integer> temp=new Stack<>();
    //     int len=s.size();
    //     for(int i=1;i<len;i++)
    //         temp.push(s.pop()); // TOP: 4
    //     int popped=s.pop(); //7 5

        
    //     while(!temp.isEmpty())
    //         s.push(temp.pop());// TOP: 4
        
    //     reverse(s);
        
    //     s.push(popped);
    // 
    // }
    
    
    //Without Using Extra Space
        static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size()==0) return;
        int top=s.pop();
        reverse(s);
        
        insertAtBottom(s,top);

        
    }
    
    static void insertAtBottom(Stack<Integer> s,int element)
    {
        if(s.isEmpty())
        {
            s.push(element);
            return;
        }
        
        int top=s.pop();
        insertAtBottom(s,element);
        s.push(top);
    }
}
