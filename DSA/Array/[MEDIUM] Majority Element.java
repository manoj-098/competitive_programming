
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<size;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int max=-1;
        for(Map.Entry m:map.entrySet())
        {
            max=Math.max(max,(int)m.getValue());
            if(max>size/2) return (int)m.getKey();
        }
        return -1;
    }
}
