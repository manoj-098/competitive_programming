
class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // BRUTT FORCE------------------------------Time Complexity:O(N^3)
        // long max=Long.MIN_VALUE;
        // for(int start=0;start<N;start++)
        // {
        //     // int first=arr[start];
        //     // int second=0;
        //     long sum=0;
        //     long first=Long.MAX_VALUE,second=Long.MAX_VALUE;
        //     for(int end=start;end<N;end++)
        //     {
        //         if(arr[end]<=first)
        //         {
        //             second=first;
        //             first=arr[end];
        //         }
        //         else if(arr[end]<second && arr[end]>first)
        //         {
        //             second=arr[end];
        //         }
        //         if(end==start) continue;
        //         sum=first+second;
        //         max=Math.max(max,sum);
        //     }
        // }
        // return max;
        
        //IObserving question and answers properly, we could understand that it is a maximum two sum problem. Hence we used the two sum solution
        long res=0;
        long sum=0;
        for(int i=0;i<2;i++)
        {
            sum+=arr[i];
        }
        res=sum;
        int start=0;
        int end=2;
        while(end<N)
        {
            sum-=arr[start];
            sum+=arr[end];
            res=Math.max(res,sum);
            start++;
            end++;
        }
        return res;
        
    }
}
