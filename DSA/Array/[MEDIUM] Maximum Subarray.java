class Solution {
    public int maxSubArray(int[] nums) {

       // Kadane's Algorithm
       //OPTIMAL APPROACH------------Time Complexity:O(N)
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0; //to avoid reducing the sum value
        }
        return max;

    }
}
