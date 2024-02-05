class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++)//1 1 1 2 2 3
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else{
                list.add(count);
                count=1;
            }
            if(i==arr.length-2) list.add(count);
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)==list.get(i+1)) return false;
        }
        return true;
    }
}
