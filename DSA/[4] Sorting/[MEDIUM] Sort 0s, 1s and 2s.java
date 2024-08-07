class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int curr=0,left=0,right=n-1;
        while(curr<=right)
        {
            if(a[curr]==0)
            {
                int temp=a[left];
                a[left]=a[curr];
                a[curr]=temp;
                left++;
                curr++;
            }
            else if(a[curr]==2)
            {
                int temp=a[right];
                a[right]=a[curr];
                a[curr]=temp;
                right--;
            }
            else
            {
               curr++; 
            }
        }
        
    }
}
