class Solution {
    public int romanToInt(String s) {
        int sum=0,prev=0,curr=0;
        boolean flag=false;
        for(int i=s.length()-1;i>=0;i--)
        {
            // System.out.println("CURR CH: "+s.charAt(i));
            switch(s.charAt(i))
            {
                case 'I':
                    curr=1;
                    if(!flag) prev=1;
                    break;
                case 'V':
                    curr=5;
                    if(!flag) prev=5;
                    break;
                case 'X':
                    curr=10;
                    if(!flag) prev=10;
                    break;
                case 'L':
                    curr=50;
                    if(!flag) prev=50;
                    break;
                case 'C':
                    curr=100;
                    if(!flag) prev=100;
                    break;
                case 'D':
                    curr=500;
                    if(!flag) prev=500;
                    break;
                case 'M':
                    curr=1000;
                    if(!flag) prev=1000;
                    break;
            }
            // System.out.println("CURR: "+curr+"---PREV: "+prev);
            if(flag)
            {
             if(curr<prev)   sum=sum-curr;
             else    sum=sum+curr;
            //  System.out.println("SUM: "+sum);          
             prev=curr;
             curr=0;
            }
            if(!flag)
            {
                flag=true;
                sum+=prev;
            }

        }
        return sum;
    }
}
