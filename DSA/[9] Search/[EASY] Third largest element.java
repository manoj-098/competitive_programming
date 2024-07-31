class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int first=-1;
        int second=-1;
        int third=-1;
        // if(arr.length<3) return -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;//2 
                first=arr[i];//4
            }
            else if(arr[i]>second)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third)
            {
                third=arr[i];
            }
        }
        return third;
    }
}
