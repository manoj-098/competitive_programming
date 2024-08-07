
class Sol
{
    int isPossible (String S)
    {
        // your code here
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        int oddCount=0;
        for(Map.Entry m:map.entrySet())
        {
            if(((int)m.getValue())%2!=0) oddCount++;
            if(oddCount>1) return 0;
        }
        return 1;
    }
}
