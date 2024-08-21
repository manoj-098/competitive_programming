//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends



//-------------------------------------------------------------
// FAILED TO MEET 4 TEST CASES
//-------------------------------------------------------------
class Solution{
    static int minJumps(int[] arr){
        // your code here
        int sum=0;
        int jump=0,i=0;
        while(jump<arr.length)
        {
            if(i>=arr.length-1) 
                return jump;
            try
            {
                if(arr[i]!=0)
            {
                i+=arr[i];
                jump++;
            }
            else i--;
            }
            catch(Exception e){
                return -1;
            }
            
        }
        return -1;
        
    }
}
