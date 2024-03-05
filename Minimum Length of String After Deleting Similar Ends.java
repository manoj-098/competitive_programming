class Solution {
    public int minimumLength(String s) {
        if(s.length()==1) return 1;
        int start=0;
        int end=s.length()-1;
        int res=s.length();
        boolean flagLeft=false;
        boolean flagRight=false;
        while(start<end && s.charAt(start)==s.charAt(end))
        {

            for(int i=start+1;i<end;i++)
            {
                if(s.charAt(i)==s.charAt(start))
                {
                    start++;
                    res--;
                }
                else break;
            }
            for(int i=end-1;i>start;i--)
            {
                if(s.charAt(i)==s.charAt(end))
                {
                    end--;
                    res--;
                }
                else break;
            }

start++;
end--;
res-=2;
            // res=end-start-1;
            // if(s.charAt(start)==s.charAt(start+1) && start+1!=end)   start++;
            // else flagLeft=true;

            // if(s.charAt(end)==s.charAt(end-1) && end-1!=start)    end--;
            // else  flagRight=true;

            // if(flagLeft && flagRight)
            // {
            //     res=(end-start)-1;
            //     flagLeft=false;
            //     flagRight=false;
            //     start++;
            //     end--;
            // }
        }
        if(res<0) return 0;
        return res;
    }
}
