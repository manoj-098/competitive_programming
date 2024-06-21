

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int pivot=pivotIndex(arr,n);
        if(pivot==-1) return 0;
        return pivot+1;
    }
    public static int pivotIndex(int[] arr,int n)
    {
        int start=0;
        int end=n-1;
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
