//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    ArrayList<Integer> assign(int a[], int n)
    {
        // Complete the function
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(a);
        int start=0,end=n-1;
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0)
                list.add(a[end--]);
            else 
                list.add(a[start++]);
        }
                return list;
        }
    
        
    }
  
    



//{ Driver Code Starts.

// Driver class
class GFG {
    //method to check for the correct answer
    public static boolean checkOrder(ArrayList<Integer> res){
	    for(int i = 1; i < res.size(); i++){
	        if(i%2 != 0){
	            if(res.get(i) < res.get(i-1))
	            {
	                return false;
	            }
	        }
	        else{
	            if(res.get(i) > res.get(i-1)){
	                return false;
	            }
	        }
	    }
	    return true;
	}
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.assign(arr, sizeOfArray);
		    
		    boolean check_ans = checkOrder(res);
		    if(check_ans)
	            System.out.println("Correct");
	        else 
	            System.out.println("Wrong Answer");
		}
	}
}


            

// } Driver Code Ends
