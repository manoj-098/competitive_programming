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
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		while(test-->0)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		         a[i]=in.nextInt();
		     Arrays.sort(a);
		     for(int i=0;i<n-1;i+=2)
		     {
		         if(a[i]!=a[i+1]) 
		        {
		             System.out.println(a[i]);
		             break;
		         }
		     }
		    
		}
	}
}
