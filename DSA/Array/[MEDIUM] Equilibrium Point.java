
class Solution {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int left[]=new int[n];
        int right[]=new int[n];
        
        //creating left sum
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            left[i]=sum; //1 4 9 11 13 
        }
        
        sum=0;
        //creating right sum
        for(int i=n-1;i>=0;i--)
        {
            sum+=arr[i];
            right[i]=sum;//13 12 9 4 2
        }
        
        //checking for equality
        for(int i=0;i<n;i++)
        {
            if(left[i]==right[i]) return i+1;
        }
        return -1;
    }
}
