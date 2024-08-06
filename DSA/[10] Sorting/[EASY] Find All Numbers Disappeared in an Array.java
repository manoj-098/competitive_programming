class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //perform cyclic sort
        int i=0;
        while(i<nums.length)
        {
            int crctIdx=nums[i]-1;
            if(crctIdx!=nums.length && nums[i]!=nums[crctIdx])
            {
                int temp=nums[i];
                nums[i]=nums[crctIdx];
                nums[crctIdx]=temp;
            }
            else i++;
        }
        // System.out.println(Arrays.toString(nums));
        //linear search
        List<Integer> list=new ArrayList<>();
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1) list.add(i+1);
        }
        return list;
            
    }
}
