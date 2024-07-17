class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>(); 
        //Using map to retrieve value at specific index 
        
        int res[]=new int[nums2.length];
        res[nums2.length-1]=-1;
        stack.push(nums2[nums2.length-1]);
        map.put(nums2[nums2.length-1],-1);
        for(int i=nums2.length-2;i>=0;i--)
        {
            int curr=nums2[i];
            while(!stack.isEmpty() && stack.peek()<=curr)
                stack.pop();

            if(stack.isEmpty()) res[i]=-1;
            else res[i]=stack.peek();

            stack.push(curr);

            map.put(nums2[i],res[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
        // int index[]=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {
        //         if(nums2[j]==nums1[i])
        //         {
        //             index[i]=j;
        //             break;
        //         }
        //     }
        // }
        // int ans[]=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++)
        // {
        //     ans[i]=res[index[i]];
        // }
        // return ans;
    }
}
