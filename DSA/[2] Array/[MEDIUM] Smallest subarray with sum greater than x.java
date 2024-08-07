
class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int start=0,end=0,min=Integer.MAX_VALUE,sum=0;
        while(end<n)
        {
            sum+=a[end];
            while(sum>x)
            {
                min=Math.min(min,end-start+1);
                sum-=a[start++];
            }
            end++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}

