class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int start=0,end=0;
        while(end<n)
        {
            if(arr[end]!=0)
            {
                //swap the non-zero element with zero
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                
                end++;
                start++;   
            }
            else    end++;
        }
    }
}

// if the index number upto which the non-zero elements exists is asked, them no need of swapping. Instead just assign arr[start]=arr[end].
