class Solution {
    public int findDuplicate(int[] nums) {
        //without modifying array
        return twoPointer(nums);

        //bymodifying array
        // return cyclicSort(nums)
    }

    public int twoPointer(int[] nums)
    {
        // Slow pointer
        int slow = nums[0];
        // Fast pointer
        int fast = nums[nums[0]];

        // Find the meeting point of slow and fast pointers
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Find the entrance to the cycle
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }


    public int cyclicSort(int[] nums)
    {
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

        for(i=0;i<nums.length;i++)
            if(nums[i]!=i+1) return nums[i];

        return nums.length;
    }
}
