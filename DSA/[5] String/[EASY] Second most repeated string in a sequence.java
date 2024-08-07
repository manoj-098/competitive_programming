

//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<N;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        int first=0,second=0;
        for(Map.Entry<String,Integer> m:map.entrySet())
            first=Math.max(first,m.getValue());
        
        String res="";
        for(Map.Entry<String,Integer> m:map.entrySet())
        {
            if(m.getValue()!=first && m.getValue()>second) 
            {
                // second=Math.max(second,m.getValue());
                second=m.getValue();
                res=m.getKey();
            }
        }
        return res;
        // for(Map.Entry<String,Integer> m:map.entrySet())
        //     if(m.getValue()==second) return m.getKey();
            
        // return "";
    }
}
