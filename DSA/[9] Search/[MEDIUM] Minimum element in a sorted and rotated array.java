class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int peakIdx=findPivot(arr,n);
        return arr[(peakIdx+1)%n];
    }
    
    int findPivot(int arr[],int n)
    {
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]) return mid-1;
            else if(mid<n-1 && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[start]) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
