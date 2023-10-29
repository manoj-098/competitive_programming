class Solution
{
    public long minimumBuckets(int N, int arr[])
    {
        long count=0;//14 21 35 49
        int temp=arr[0];
        for(int i:arr) temp=GCD(temp,i);
        
        for(int i:arr)
        {
            count+=(i/temp);
        }
        return count;
    }
    
     int GCD(int a, int b)
        {
            if(a==0) return b;
            else return GCD(b%a,a);
        }

    
}
