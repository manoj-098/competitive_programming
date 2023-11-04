//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().segregateEvenOdd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        // int i,j;
        int odd[]=new int[n];
        int even[]=new int[n];
        int odd_count=0,even_count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0) even[even_count++]=arr[i];
            else odd[odd_count++]=arr[i];
        }
        
        //sorting the even and odd array
        Arrays.sort(even);
        Arrays.sort(odd);
        
        //computing the starting index of even and odd array excepting zeros
        int even_start=n-even_count;
        int odd_start=n-odd_count;
        
        int index=0;
        for(int i=even_start;i<n;i++)
        {
            arr[index++]=even[i];
            
        }

       for(int i=odd_start;i<n;i++)
        {
            arr[index++]=odd[i];
            
        }
        
        
        
    }
}
