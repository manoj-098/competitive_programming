
// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        for(int i=0;i<n;i++)
        {
            
            try{
                if(array[i]!=(i+1)) return i+1;
            }
            catch(Exception e)
            {
                return n;
            }
        }
        return 0;
    }
}
