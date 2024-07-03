class Solution {
    public boolean isHappy(int n) {

        //APPROACH 2: Using Set
        Set<Integer> set=new HashSet<>();
        int ans=n;
        while(true)
        {
            ans=calculate(ans);
            if(ans==1) return true;
            if(set.contains(ans)) break;
            set.add(ans);
        }
        return false;

        //APPROACH 1: Using Fast and slow pointer concept of LinkedList
        // int slow=n;
        // int fast=n;
        // while(slow!=1 && fast!=1)
        // {
        //     slow=calculate(slow);
        //     fast=calculate(calculate(fast));
        //     if(slow==fast && slow!=1) return false;
        // }
        // return true;
    }
    public static int calculate(int num)
    {
        int ans=0;
        while(num>0)
        {
            int rem=num%10;
            ans+=(rem*rem);
            num/=10;
        }
        return ans;
    }
}
