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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(int[] arr, int sum,int sep,int N) {
    // Write your code here
    int sum_1=0,count=0;
    boolean flag=true;
    if(sep==1)
    {
        for(int i=0;i<N;i++)
        {
            if(arr[i]==sum) count++;
        }
    }
    else
    {
    for(int i=0;i<=N-sep;i++)
    {
       // count=0;
        sum_1=0;
        for(int j=0;j<sep;j++)
        {
            sum_1+=arr[i+j];
           // System.out.print(sum_1+" ");
        }
        if(sum_1==sum)
        {
             count++;
            // System.out.println("SUM_1:"+sum_1+" COUNT: "+count);
        }
    }
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int N=in.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++)
        arr[i]=in.nextInt();
    int sum=in.nextInt();
    int sep=in.nextInt();
    Result obj=new Result();
    int res=obj.birthday(arr,sum,sep,N);
    System.out.println(res);
    }
}
