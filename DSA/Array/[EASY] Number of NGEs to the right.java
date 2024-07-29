class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    // code here
    int res[]=new int[queries];
    int index=0;
    for(int i:indices)
    {
        int count=0;
        int curr=arr[i];
        for(int j=i+1;j<N;j++)
            if(arr[j]>curr) count++;
        res[index++]=count;
    }
    return res;
  }
}
