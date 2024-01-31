import java.util.*;
public class TestClass{
    public static void main(String args[])
    {
        java.util.LinkedList<Integer> list=new java.util.LinkedList<Integer>();
        java.util.LinkedList<Integer> reslist=new java.util.LinkedList<Integer>();
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        for( int i=0;i<N;i++)
        {
            list.add(in.nextInt());
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                arr.add(list.get(i));
                if(i==list.size()-1)
                {
                    Collections.reverse(arr);
                    reslist.addAll(arr);
                }
            }
            else
            {
                if(arr.size()!=0)
                {
                    Collections.reverse(arr);
                    reslist.addAll(arr);
                    arr.clear();
                }
                reslist.add(list.get(i));
            }
        }
        // System.out.println(reslist.toString());
        for(int i=0;i<N;i++)
        {
            System.out.print(reslist.get(i)+" ");
        }

    }
}
