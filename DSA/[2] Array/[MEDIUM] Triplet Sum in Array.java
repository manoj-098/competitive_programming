

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       Arrays.sort(A);
      int curr=0;
      for(curr=0;curr<n-1;curr++)
      {
          int start=curr+1;
          int end=n-1;
          while(start<end)
          {
              if(A[curr]+A[start]+A[end]==X)     return true;
              else if(A[curr]+A[start]+A[end]<X) start++;
              else end--;
               
          }
      }
      return false;
    
    }
}
