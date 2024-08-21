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
		    int N=in.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++)
		        arr[i]=in.nextInt();
		    Arrays.sort(arr);
		    System.out.println(arr[N-1]);
		}
	}
}
