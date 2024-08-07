class Solution {
    public int removeDuplicates(int[] nums) {
            int start=0,end=0;

            for(end=1;end<nums.length;end++)
            {
                if(nums[end]!=nums[start]) nums[++start]=nums[end];
            }
            return start+1;
    }
}
