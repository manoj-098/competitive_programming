

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        if(n<3) return 0;
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>1;i--)
        {
           int left=0,right=i-1;
           while(left<right)
           {
               if(arr[left]+arr[right]>arr[i])   
               {
                   count+=right-left;
                   right--;
               }
               else left++;
           }
        }
        return count;
    }
}
