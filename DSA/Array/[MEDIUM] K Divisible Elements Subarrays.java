class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<ArrayList<Integer>> list=new HashSet<>();
        for(int start=0;start<nums.length;start++)
        {
            int end=start;
            int count=0;
            ArrayList<Integer> l=new ArrayList<>();
            for(end=start;end<nums.length;end++)
            {
                if(nums[end]%p==0) count++; //optimized approach
                if(count>k) break; //optimized approach
                l.add(nums[end]);
                list.add(new ArrayList<>(l));
            }
        }
            return list.size(); //optimized approach
            
            //normal approach
        // int res=0;
        // for(ArrayList<Integer> l1:list)
        // {
        //     int count=0;
        //     for(Integer val:l1)
        //     {
        //         if(val%p==0) count++;
        //     }
        //     if(count<=k) res++;
        // }
        // return res;
    }
}
