

class Sol
{
    long equalPairs (String s)
    {
        //APPROACH 1: -------------------Time Complexity:O(N)
        // Map<Character, Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++)
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        // long ans=0;
        // for(Map.Entry<Character,Integer> m:map.entrySet())
        //     ans+=m.getValue()*m.getValue();
        
        // return ans;
        
        //APPROACH-2------------------------Time Complexity: O(N^2)
        long ans=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j)) ans++;
            }
        }
        return ans;
    }
}
