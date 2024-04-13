class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k;
        double avg=0,sum=0;
        double maxAvg=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        avg=sum/k;
        maxAvg=avg;
        while(right<nums.length)
        {
            sum-=(nums[left++]);
            sum+=(nums[right++]);
            avg=sum/k;
            maxAvg=Math.max(maxAvg,avg);
        }
        return maxAvg;
    }
}
