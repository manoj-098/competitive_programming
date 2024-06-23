class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i]) count++; //if array is sorted and rotated, then only one pair of element will satisfy this condition
        }
        //if array is sorted and not rotated at all only, then the last element will be greater than the first element
        if(nums[nums.length-1]>nums[0]) count++;
      
        return count<=1?true:false;
    }
}
