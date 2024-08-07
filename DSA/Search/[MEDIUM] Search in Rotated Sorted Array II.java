class Solution {
    public boolean search(int[] nums, int target) {
        int pivot;
        if(nums.length==1) pivot=0;
        else pivot=pivotIndex(nums);
        System.out.println("["+pivot+"]");
        if(pivot==-1)
        {
            return bSearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot]==target) return true;
        else if(target>=nums[0]) return bSearch(nums,0,pivot-1,target);
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
            else if(arr[mid]==arr[start] && arr[mid]==arr[end] && start!=mid)
            {
                if(arr[start]>arr[start+1]) return start;
                start++;
                if(arr[end]<arr[end-1]) return end-1;
                end--;
            }
            else if(arr[start]<=arr[mid]) start=mid+1;                              
            else end=mid-1;
        }
        return -1;
    }

    public static boolean bSearch(int[] arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
