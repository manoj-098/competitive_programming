class Solution {
    public int findMin(int[] nums) {
        // int pivot=pivotIndex(nums);
        // System.out.println(pivot);
        // if(pivot==-1) return nums[0];
        // return nums[pivot+1];
        return min(nums);
    }

    public static int min(int[] arr)
    {
        int start=0;//3 1 2
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[arr.length-1]) start=mid+1;
            else end=mid-1;
        }
        // System.out.println(arr[start]);
        return arr[start];
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
            else if(arr[start]<=arr[mid]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
