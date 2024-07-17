class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        //Since it is a circular linked array, use i%n everywhere instead of i
        int res[]=new int[nums.length];
        res[nums.length-1]=-1;
        stack.push(nums[nums.length-1]);
        for(int i=2*nums.length-1;i>=0;i--)
        {
            int curr=nums[i%nums.length];
            while(!stack.isEmpty() && stack.peek()<=curr)
                stack.pop();
            
            if(stack.isEmpty()) res[i%nums.length]=-1;
            else res[i%nums.length]=stack.peek();

            stack.push(curr);
        }
        return res;
    }
}
