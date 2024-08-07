class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        if(target>nums[nums.length-1] || target<nums[0]) return new int[]{-1,-1};
        return new int[]{lessThan(nums,target),greaterThanOrEqual(nums,target)};
    }
    public int lessThan(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target) start=mid+1;// 1 1 1 1
            else end=mid-1;
        }
        return arr[start]==target?start:-1;
    }
    public int greaterThanOrEqual(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<=target) start=mid+1;// 5 7 8 8 10
            else end=mid-1;
        }
        return arr[end]==target?end:-1;
    }
}
