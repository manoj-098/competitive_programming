import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static int[] breakingRecords(int arr[],int n) {
    // Write your code here
    //List <Integer> high=new ArrayList<Integer>();
   // List <Integer> low = new ArrayList<Integer>();
    int high[]=new int[n];
    int low[]=new int[n];
    high[0]=arr[0];
    low[0]=arr[0];
   // high.set(0,scores.get(0));
   // low.set(0,scores.get(0));
    int h_count=0,l_count=0;
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>high[i-1])
        {
            high[i]=arr[i];
            h_count++;
        }
        else
            high[i]=high[i-1];
        //System.out.print(high.get(i));
        if(arr[i]<low[i-1])
        {
            low[i]=arr[i];
            l_count++;
        }
         else
            low[i]=low[i-1];
        //System.out.println(low.get(i));
    }
    int res[]={h_count,l_count};
    return res;
    }

}

public class Solution extends Result{
    public static void main(String[] args) throws IOException {
         Scanner in = new Scanner(System.in);
         int n=in.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
             arr[i]=in.nextInt();
         //Result obj=new Result();
         int res[]=breakingRecords(arr,n);
         for(int i:res)
           System.out.print(i+" ");
         
    }
}
