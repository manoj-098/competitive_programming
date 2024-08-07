class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivotIndex(nums);
        if(pivot==(-1))//means array is not rotated at all
        {
            //perform normal binary search on full array
            return bSearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot]==target) return pivot;
        //element in left part
        else if(target>=nums[0]) return bSearch(nums,0,pivot-1,target);
        //element in right part
        return bSearch(nums,pivot+1,nums.length-1,target); 
    }
    public static int pivotIndex(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            else if(arr[start]<arr[mid]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    public static int bSearch(int[] arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
