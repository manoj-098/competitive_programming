
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node start=head;
        Node end=head;
        while(end.next!=null)
            end=end.next;
            
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       while(start!=null && end!=null && start.data<end.data)
      {
          int sum=start.data+end.data;
          if(start.data==end.data) sum-=start.data;
        if(sum==target)
      {
          list.add(new ArrayList<>(Arrays.asList(start.data,end.data)));
          end=end.prev;
          start=start.next;
      }
      else if(sum<target) start=start.next;
      else end=end.prev;
      }
      return list;
    }
}
        
