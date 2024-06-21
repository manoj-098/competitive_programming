
class Solution {
    public static int kthLargest(int N, int K, int[] Arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        //generating all possible sub-arrays
        for(int start=0;start<N;start++)
        {
            int sum=0;
            for(int end=start;end<N;end++)
            {
                sum+=Arr[end];
                list.add(sum);//adding the sum of all sub-arrays
            }
        }
        Collections.sort(list);
        return list.get(list.size()-K);
    }
}
