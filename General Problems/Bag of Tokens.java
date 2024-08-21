class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==1)
        {
            if(power<tokens[0]) return 0;
            else return 1;
        }
        int start=0,end=tokens.length-1,score=0,faceUp=0,faceDown=0;
        Arrays.sort(tokens);
        int temp=0;
        for(int i=0;i<tokens.length && start<=end;i++)
        {
            if(tokens[i]<=power) 
            {
            score++;//2
            temp=score;
            power-=tokens[i];//0
            // tokens[start]=-1;//0 0 0 0
            start++;//3
            }
            else if(score!=0)
            {  
                power+=tokens[end];//500
                score--;//0
                temp=Math.max(temp,score);
                // tokens[end]=-1;//0 200 300 0
                end--;//2
                i=start-1;
            }
            else
            {
                
            }

        }
        return temp;
    }
}
