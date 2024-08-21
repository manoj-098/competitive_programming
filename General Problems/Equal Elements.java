/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in= new Scanner(System.in);
		int test=in.nextInt();
		while(test-->0)
		{
		    int N=in.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++) arr[i]=in.nextInt();
		    Arrays.sort(arr);
		    int sum=1,max=0;
		    // 1 1 2 3 4 4 4 
		    int flag=0;
		    for(int i=0;i<N-1;i++)
		    {
		       
		        if(arr[i]==arr[i+1])
		        {
		            sum++;
		            if(sum>max) flag=0;
		        }
		        else
		        {
		            if(sum>max) max=sum; //4 
		            sum=1;
		            flag=1;
		        }
		    }
		    if(flag==0) max=sum;
		    int res=N-max;
		    System.out.println(res);
		}
	}
}
