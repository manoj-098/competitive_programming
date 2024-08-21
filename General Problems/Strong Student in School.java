//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n,m,i;
                    n = sc.nextInt();
                    m = sc.nextInt();
                    int arr[] = new int[n];
                    for(i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                    Sol obj = new Sol();
                    System.out.println(obj.diffSum(n,m,arr));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int diffSum(int n,int m,int arr[])
    {
        //code here.
        int left=0,right=0;
        Arrays.sort(arr);
        for(int i=0;i<m;i++)
        {
            left+=arr[i];
        }
        for(int i=n-1;i>=(n-m);i--)
        {
            right+=arr[i];
        }
        return right-left;
    }
}
