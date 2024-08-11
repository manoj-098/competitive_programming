// GFG: https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

class Solution {
    public static int equilibriumPoint(long arr[], int n) {

        //Using O(1) constant space
        if(arr.length==1) return 1;
        
        int right=0,left=0;
        for(int i=0;i<arr.length;i++)
            right+=arr[i];
        
        for(int curr=0;curr<arr.length;curr++)
        {
            right-=arr[curr];
            if(curr>0) left+=arr[curr-1];
            if(left==right) return curr+1;
        }
        return -1;

        
        // Using O(N) extra space
        int left[]=new int[n];
        int right[]=new int[n];

        left[0]=arr[0];
        for(int i=1;i<n;i++)
            left[i]=left[i-1]+arr[i]; //1 4 9 11 13 
        
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
            right[i]=right[n+1]+arr[i];
        
        //checking for equality
        for(int i=0;i<n;i++)
            if(left[i]==right[i]) return i+1;
        
        return -1;
    }
}
