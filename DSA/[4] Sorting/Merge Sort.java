class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Size of Left and Right array
         int sizeL=m-l+1;
         int sizeR=r-m;
         
         //creating and array of left and right to storeelements
         int left[]=new int[sizeL];
         int right[]=new int[sizeR];
        
        //storing elements in arrays 
        for(int i=0;i<sizeL;i++)
            left[i]=arr[l+i];
            
        for(int i=0;i<sizeR;i++)
            right[i]=arr[m+1+i];
            
        //merging two sorted arrays into a single array
        int i=0,j=0,k=l;
        
        while(i<sizeL && j<sizeR)
        {
            if(left[i]<=right[j])    arr[k++]=left[i++];
            else    arr[k++]=right[j++];
        }
        while(i<sizeL)
            arr[k++]=left[i++];
            
        while(j<sizeR)
            arr[k++]=right[j++];
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
}
