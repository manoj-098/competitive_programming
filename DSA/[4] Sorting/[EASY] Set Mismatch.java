class Solution {
    public int[] findErrorNums(int[] nums) {
        //cyclic sort
        int i=0;
        while(i<nums.length)
        {
            int crctIdx=nums[i]-1;
            if(crctIdx!=nums.length && nums[crctIdx]!=nums[i])
            {
                int temp=nums[crctIdx];
                nums[crctIdx]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }

        // int arr[]=new int[2];
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1) return new int[]{nums[i],i+1};
        }
        return null;
    }
}
