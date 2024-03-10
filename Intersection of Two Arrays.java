class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resList=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && !resList.contains(nums1[i])) resList.add(nums1[i]);
            }
        }
        int res[]=new int[resList.size()];
        int index=0;
        for(Integer i:resList)
        {
            res[index++]=i;
        }
        return res;
    }
}
