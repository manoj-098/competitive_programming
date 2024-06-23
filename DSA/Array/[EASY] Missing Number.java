class Solution {
    public int missingNumber(int[] nums) {

        //perform sort first
        int idx=0;
        while(idx<nums.length)
        {
            int correctIdx=nums[idx];//1
            if(correctIdx!=nums.length && nums[idx]!=idx)//0!=
            {
                    int temp=nums[idx];
                    nums[idx]=nums[correctIdx];
                    nums[correctIdx]=temp;
            }
            else idx++;
        }

        //then find missing element
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i) return i;
        }
        return nums.length;

    }
}
