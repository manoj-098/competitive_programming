class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new TreeSet<>();
        
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        
        nums=new int[set.size()];
        int index=0;
        for(int val:set)
            nums[index++]=val;

        System.out.println(Arrays.toString(nums));

        int count=1,max=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                count++;
                max=Math.max(max,count);
            }
            else count=1;
        }
        return max;
    }
}
