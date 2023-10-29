//User function Template for Java

class Solution{
    static int maxoccourence(int[] arr,int n,int k){
        // code here
        int count=0,max=0,index=0,tempRes=0,flag=0,tempCount=0;
        String str;
        char ch=(char)(k+'0');
        int tempArr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            count=0;
            str=Integer.toString(arr[i]);
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==ch)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                count=0;
                tempRes=arr[i];
                tempArr[0]=arr[i];
                flag=1;
            }
            else if(count==max)
            {
                if(count>tempCount)
                {
                    tempArr=new int[n];// Making all elements of array to zero by re-initializing
                    index=0;
                    tempArr[0]=tempRes;// assigning the first index to newly updated element with the maximum count of k value which has been found in the if block
                }
                tempArr[++index]=arr[i]; //assigning the next index with the newly found value which has the same count of k values similar to the number found in the if block i.e.second element in the tempArr
                tempCount=count;
                count=0;
                flag=0;
                //tempArr[++index]=arr[i];// 10 100 20 30 400 600 7000 80k 90k
                //flag=0;                 // 0 0 60k 70k
            }
        }
        if(flag==0)
        {
         Arrays.sort(tempArr);
         for(int i=0;i<tempArr.length;i++)
         {
            if(tempArr[i]!=0)
            {
                tempRes=tempArr[i];
                break;
            }   
         }
        }
        
        return tempRes; //returning the result
    }
    
}
