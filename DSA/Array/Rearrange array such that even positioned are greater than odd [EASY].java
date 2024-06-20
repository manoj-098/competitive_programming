//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    ArrayList<Integer> assign(int arr[], int n)
    {
        // Complete the function
        //One approach is , we can sort the array, and then keep a pointer ptr2=N-1 and ptr1=0
        //and assign even position elements with arr[ptr2--] and
        //odd position elements with arr[ptr1++]
        // But it takes O(NlogN) due to sorting
        
        //follow below method for O(N)
        //for 1 based indexing
        for(int i=1;i<n;i+=2){
            
            if(arr[i]<arr[i-1])
            {
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            
            if(i<n-1 && arr[i]<arr[i+1])
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new Integer(arr[i]));
            // System.out.print(arr[i]);
        }
        
        return list;
        
        //for 0-based indexing ,use
        //if(arr[i]>arr[i-1])
        //if(arr[i]>arr[i+1])
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
