class Solution
{
    //Function to find the next greater element for each element of the array.
  //Refer here for solution: https://takeuforward.org/data-structure/next-greater-element-using-stack/
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> stack=new Stack<>();
        long res[]=new long[n];
        res[n-1]=-1;
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            long curr=arr[i];
            while(!stack.isEmpty() && stack.peek()<=curr)
                stack.pop();
            
            if(stack.isEmpty()) res[i]=-1;
            else res[i]=stack.peek();
            
            stack.push(curr);
        }
        return res;
    } 
}
