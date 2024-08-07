class Solution
{
    long substrCount (String S, int K) {
        // your code here
        
        //APPROACH 1: Sliding Window----------------Time Complexity: O(N)
        
        //Inorder to find the no.of substringw with exactly K disntincy characters, 
        // we find no.of substrings with atmost K distint characters and then 
        //subtract it with no.of substrings with K-1 sitinct characters 
        return approach1(S,K)-approach1(S,K-1);
        // return approach1(S,K-1);
        
    }   

    public static long approach1(String S,int K)
    {
        if(K<0) return 0;
        
        int start=0,end=0,dist_count=0;
        long res=0;
        int freq[]=new int[26];
        int len=S.length();
        
        while(end<len)
        {
            freq[S.charAt(end)-'a']++;//a:1 b:1
            if(freq[S.charAt(end)-'a']==1) dist_count++;//2
            while(dist_count>K)
            {
                //shrink the window by increasing start pointer
                
                //removing the frequency of the removed character
                freq[S.charAt(start)-'a']--; //a:0
                
                //if removed character is a distinct character, decrement dist_count
                if(freq[S.charAt(start)-'a']==0) dist_count--; //1
                start++;//2
            }
            res+=(end-start+1);//1+1+1
            end++;//2
        } 
        return res;
    }
    
    public static long approach2(String S,int K)
    {
        //APPROACH 2:-----------------Time Complexity:O(N^2)
        long res=0;
        for(int start=0;start<S.length();start++)
        {
            Map<Character,Integer> map=new HashMap<>();
            // StringBuilder str=new StringBuilder();
                            // Map<Character,Integer> map=new HashMap<>();
            for(int end=start;end<S.length();end++)
            {
                // str.append(S.charAt(end));
                map.put(S.charAt(end),map.getOrDefault(S.charAt(end),0)+1);
                if(map.size()==K) res++;
            }
        }
        return res;
    }
}
