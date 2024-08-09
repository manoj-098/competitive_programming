//Leetcode: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        return fun(num,0);
    }

    public int fun(int num,int steps)
    {
        if(num==0) return steps;
        else if(num%2==0)    return fun(num/2,steps+1);
        return fun(num-1,steps+1);
    }
}
