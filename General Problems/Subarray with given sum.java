class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
    ArrayList<Integer> arrList=new ArrayList<>();
    int sum=0,i=0;
    for(int j=0;j<n;j++)
    {
            sum+=arr[j];
             while(sum>s && i<j)
            {
                sum-=arr[i];
                i++;
            }
            if(sum==s)
            {
                arrList.add(i+1);
                arrList.add(j+1);
                return arrList;
            }
           
     }
     arrList.add(-1);
    return arrList;
    }
}
