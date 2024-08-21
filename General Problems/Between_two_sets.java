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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int max=0,min=b.get(0);
    for(int i=0;i<a.size();i++)
       if(max<a.get(i)) max=a.get(i);
    for(int i=1;i<b.size();i++)
        if(min>b.get(i)) min=b.get(i);
    List<Integer> fact = new ArrayList<Integer>();
    boolean flag=true;
    for(int i=max;i<=min;i++)
    {
        flag=true;
        for(int j=0;j<a.size();j++)
        {
            if(i%a.get(j)!=0) 
            {
                flag=false;
                break;
            }
        }
        if(flag) fact.add(i);
    }
    int count=0;
    for(int i=0;i<fact.size();i++)
    {
        flag=true;
        for(int j=0;j<b.size();j++)
        {
            if(b.get(j)%fact.get(i)!=0)
            {
                flag=false;
                break;
            }
            
        }
        if(flag) count++;
        
        
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
