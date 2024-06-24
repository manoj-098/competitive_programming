

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int ptr1=0,ptr2=0,ptr3=n-1;
        while(ptr1<n && ptr2<m)
        {
            if(arr1[ptr1]>arr2[ptr2])
            {
                long temp=arr2[ptr2];
                arr2[ptr2]=arr1[ptr3];
                arr1[ptr3]=temp;
                ptr2++;
                ptr3--;
            }
            else
            {
                ptr1++;
            }
        }
        Arrays.sort(arr1); //(or) we can also perform insertion sort within the if() itself by repeatedly right rotating the array1 by 1 position.
        Arrays.sort(arr2);
    }
}
