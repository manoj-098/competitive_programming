class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return binarySearch(letters,target);
    }
    public char binarySearch(char []arr,char target)
    {
        int start=0;
        int end=arr.length-1;
        //when no char greater than the target exists in the array, return first character
        if(target>=arr[end]) return arr[start];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<=target) start=mid+1;
            else end=mid-1;
        }
        return arr[start];
    }
}
