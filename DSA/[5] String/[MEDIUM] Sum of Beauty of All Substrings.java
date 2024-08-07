class Solution {
    public int beautySum(String s) {
        int res=0,count=0;
        
        int len=s.length();
        for(int start=0;start<len;start++)
        {
            int freq[]=new int[26];
            for(int end=start;end<len;end++)
            {
                freq[s.charAt(end)-'a']++;
                int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
                for(int i=0;i<26;i++)
                {
                    if(freq[i]>0){
                    max=Math.max(max,freq[i]);
                    min=Math.min(min,freq[i]);
                    }
                }

                // if(freq[s.charAt(end)-'a']>=max && freq[s.charAt(end)-'a']!=0) max=freq[s.charAt(end)-'a'];
                // if(freq[s.charAt(end)-'a']<=min && freq[s.charAt(end)-'a']!=0) min=freq[s.charAt(end)-'a'];
                if(s.substring(start,end+1).length()>=3)
                {
                    res+=(max-min);
                }
            }
        }
        return res;
    }
}
