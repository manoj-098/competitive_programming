
class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1,end=0;
        for(int i=nums.length-2;i>=0;i--)
            if(nums[i]<nums[i+1])
            {
                bp=i;
                break;
            }

        if(bp==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>bp;i--)
            if(nums[i]>nums[bp])
            {
                end=i;
                break;
            } 

        int temp=nums[end];
        nums[end]=nums[bp];
        nums[bp]=temp;

        reverse(nums,bp+1,nums.length-1);


    }
    public static void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;            
        }
    }
}
