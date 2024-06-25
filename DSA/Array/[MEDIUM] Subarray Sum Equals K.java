class Solution {
    public int subarraySum(int[] nums, int k) {
        //Sliding window method is not possible due to presence of negative values
        return usingHashing(nums,k);
    }

  //APPROACH-1 : Hashing
    public static int usingHashing(int[] nums,int k)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for(int num:nums)
        {
            sum+=num;
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    //APPROACH-2 : Sub-array Generation
    public static int usingSubArrayGeneration(int[] nums,int k)
    {
        int sum=0,count=0,n=nums.length;
        for(int start=0;start<n;start++)
        {
            sum=0;
            for(int end=start;end<n;end++)
            {
                sum+=nums[end];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
