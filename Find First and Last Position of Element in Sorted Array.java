class Solution {
    public int[] searchRange(int[] nums, int target) {
       int START=start(nums,target);
       int LAST =last(nums,target);
       return new int[]{START,LAST};
    }
    public static int start(int[] nums,int target)
    {
        int begin=0;
        int end=nums.length-1;
        int temp=-1;
        while(begin<=end)
        {
            int mid=begin+(end-begin)/2;
            if(nums[mid]==target)
            {
                end=mid-1;
                temp=mid;
            }
            else if(nums[mid]<target) begin=mid+1;
            else end=mid-1;
        }
        return temp;
    }
    public static int last(int[] nums,int target)
    {
            int  begin=0;
            int end=nums.length-1;
            int temp=-1;
            while(begin<=end)
            {
                int mid=begin+(end-begin)/2;
                if(nums[mid]==target)
                {
                  begin=mid+1;
                  temp=mid;  
                }
                else if(nums[mid]>target) end=mid-1;
                else begin=mid+1;
            }
            return temp;

    }

}
