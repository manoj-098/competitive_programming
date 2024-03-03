class Solution {
    public static int luckyString(int N, String S) {
        // code here
        int countA=0,countB=0,countC=0,res=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='A') countA++;
            else if(S.charAt(i)=='B') countB++;
            else countC++;
            
            res++;//2
            
            if(res>=2)
            {
                if(countA>countB && countA>countC) 
                {
                    min=Math.min(res,min);
                    countA=0;
                    countB=0;
                    countC=0;
                    res=0;
                    start++;
                }
                if(countA==0) 
                {
                    start++;//3
                    i=start-1;//2
                    res=0;
                    countB=0;
                    countC=0;
                }
                else if(S.charAt(i)=='A')
                {
                    start=i;
                    i=start-1;
                    countB=0;
                    countC=0;
                    countA=0;
                    res=0;
                }
                else
                {
                    
                }
            }
        }
        return min==Integer.MAX_VALUE? -1: min;
    }
}
