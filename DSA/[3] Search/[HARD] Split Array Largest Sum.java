class Solution {
    public int splitArray(int[] nums, int k) {
        
        //Find the minimum possible answer i.e: The largest element i the array
        //Find the maximum possible answer i.e: The sum of all elements in the array
        int startRange=0;
        int endRange=0;
        for(int i=0;i<nums.length;i++)
        {
            startRange=Math.max(startRange,nums[i]);
            endRange+=nums[i];
        }

        //Now we have got the range of possible answers i.e: from startRange to endRange
        //Hence we can perform binary Search on that range of elements
        while(startRange<endRange)
        {
            int currTarget=startRange+(endRange-startRange)/2;
            int sum=0,peices=1;
            for(int i=0;i<nums.length;i++)
            {
                if(sum+nums[i]>currTarget)
                {
                    sum=nums[i];
                    peices++;
                }
                else sum+=nums[i];
            }
            if(peices<=k)
            {
                //if found peices are less than k, it means that the currTarget is larger, so decrease it
                //if found peices are equal, there might be a possibility that still a lesser currTarget can be the answer. So decrease it
                endRange=currTarget; 
                //the reason why we didnt put end=currTarget+1 is currTarget can still be the answer.
            }
            else
            {
                //if found peives are greater, then the currTarget is lesser, so increase it
                startRange=currTarget+1;
                //the reason why we are putting +1 here is, the currTarget here cannot be the answer since here the peices are more than k(what is needed)
            }
        }
        return startRange;//here at this point both startRange and endRange will be equal;
    }

}
