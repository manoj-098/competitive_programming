class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        //low and high denotes the starting and ending of the incoming array
        //whereas start and end denoted the pointer for arranging elements in the partition
        if(low<high)
        {
            //start pointer starts from the begining og the array
            //end pointer starts from the last element of the array
            int start=low;
            int end=high;
            int mid=low+(high-low)/2;
            //pivot can be chosen in any way :
            //Always first element, Always last element, Always mid, Random element 
            int pivot=arr[mid];
            while(start<=end)
            {
                while(arr[start]<pivot)
                    start++;
                while(arr[end]>pivot)
                    end--;
                if(start<=end)
                {
                    //swap start and end elements and move them one position ahead
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    
                    start++;
                    end--;
                }
            }
            //if start > end
            //perform quick sort on left and right partiion
            quickSort(arr,low,end); 
            quickSort(arr,start,high);
            //here we r using (low,end) instead of (low,start) because when the above 
            //loop breaks, start pointer would have crossed end pointer 
            //i.e: end comes before start 
            //[low, _ , _ ,end,pivot,start, _ , _, high] 
            
        }
    }

}
