class Solution {
    public int trap(int[] height) {
        // return withExtraSpace(height);
        return withoutExtraSpace(height);
    }

    //Time Complexity----------O(N)
    //Space Complexity---------O(1)
    public int withoutExtraSpace(int[] height)
    {
        int N=height.length;
        int left=0,right=N-1;
        int leftMax=0,rightMax=0; //two pointer
        int tot=0;
        
        while(left<right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]<leftMax)    tot+=leftMax-height[left];
                else    leftMax=height[left];
                left++;
            }
            else
            {
                if(height[right]<rightMax)  tot+=rightMax-height[right];
                else rightMax=height[right];
                right--;
            }
        }
        return tot;
    }

    //Time Complexity----------O(N)
    //Space Complexity---------O(N)
    public int withExtraSpace(int[] height)
    {
        int N=height.length;
        int left=0,right=N-1;
        int prefix[]=new int[N];
        int sufix[]=new int[N];
        int tot=0;

        prefix[0]=height[0];
        for(int i=1;i<N;i++)
            prefix[i]=Math.max(prefix[i-1],height[i]);
        
        sufix[N-1]=height[N-1];
        for(int i=N-2;i>=0;i--)
            sufix[i]=Math.max(sufix[i+1],height[i]);
        
        for(int i=0;i<N;i++)
            tot+=Math.min(prefix[i],sufix[i])-height[i];

        return tot;
    }
}
