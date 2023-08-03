import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the triplets function below.
    static long triplets(int[] a, int[] b, int[] c) {
        //sorting
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        //new array creation
        long new_a[]=new long[a.length];
        long new_b[]=new long[b.length];
        long new_c[]=new long[c.length];
        
        //new array size
        int len_a=0,len_b=0,len_c=0;
        
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
               new_a[len_a++]=a[i];
        }
        new_a[len_a]=a[a.length-1];
        
        for(int i=0;i<b.length-1;i++)
        {
            if(b[i]!=b[i+1])
               new_b[len_b++]=b[i];
        }
        new_b[len_b]=b[b.length-1];
        
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i]!=c[i+1])
               new_c[len_c++]=c[i];
        }
        new_c[len_c]=c[c.length-1];
        
        long tot=0,sum_a=0,sum_c=0;
        for(int i=0;i<=len_b;i++)
        {
            sum_a=0;
            for(int j=0;j<=len_a;j++)
            {
                if((new_b[i]>=new_a[j]) && new_b[i]!=0 && new_a[j]!=0) sum_a++;
                
            }
            sum_c=0;
            for(int k=0;k<=len_c;k++)
            {
                if((new_b[i]>=new_c[k]) && new_b[i]!=0 && new_c[k]!=0) sum_c++;
            }
            tot+=(sum_a*sum_c);
        }
        return tot;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] lenaLenbLenc = scanner.nextLine().split(" ");

        int lena = Integer.parseInt(lenaLenbLenc[0]);

        int lenb = Integer.parseInt(lenaLenbLenc[1]);

        int lenc = Integer.parseInt(lenaLenbLenc[2]);

        int[] arra = new int[lena];

        String[] arraItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lena; i++) {
            int arraItem = Integer.parseInt(arraItems[i]);
            arra[i] = arraItem;
        }

        int[] arrb = new int[lenb];

        String[] arrbItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenb; i++) {
            int arrbItem = Integer.parseInt(arrbItems[i]);
            arrb[i] = arrbItem;
        }

        int[] arrc = new int[lenc];

        String[] arrcItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenc; i++) {
            int arrcItem = Integer.parseInt(arrcItems[i]);
            arrc[i] = arrcItem;
        }

        long ans = triplets(arra, arrb, arrc);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
