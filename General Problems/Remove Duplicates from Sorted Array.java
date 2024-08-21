class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int temp=nums[0];
        int count=1;
        list.add(temp);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=temp)
            {
                count++;
                list.add(nums[i]);
                temp=nums[i];
            }
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        for(int i=count;i<nums.length;i++)
        {
            nums[i]=0;
        }

  return count;
    }
}
