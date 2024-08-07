// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(bSearch(arr,15));
    }
    public static int bSearch(int []arr,int target)
    {
        int start=0;
        int end=6;
        //when no element greater than the target exists in the array
        if(target>arr[end]) return -1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return arr[mid];
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return arr[start];
    }
}

