class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n=nums.length;
        //perform Cyclic sort
        cyclicSort(nums);

        //then check from the begining whether the index has the respective elmenet that it
        //is supposed to hold by ignoring negatives and zero
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1) return i+1;
        }
        return n+1;
    }

    public void cyclicSort(int[] nums)
    {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int crctIdx=nums[i]-1;
            if(nums[i]>0 && crctIdx<n && nums[crctIdx]!=nums[i])
            {
                int temp=nums[crctIdx];
                nums[crctIdx]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }
        // System.out.println(Arrays.toString(nums));
    }
}
