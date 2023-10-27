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
		Scanner in=new Scanner(System.in);
		int test=in.nextInt();
		while(test-->0)
		{
		    int N=in.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++)
		        arr[i]=in.nextInt();
		   Arrays.sort(arr);
		   int arr_1[]=new int[N];
		   int index=0;
		   int sum=1,max=0;
		   for(int i=0;i<N-1;i++)
		   {
		       if(arr[i]==arr[i+1]){
		           sum++;
		           if(i==N-) arr_1[index]=sum;
		       }
		       else{
		          arr_1[index]=sum;//1 1 
		          sum=1;
		       }
		       index++;
		   }
		       Arrays.sort(arr_1);
		       if(arr_1[N-1]!=arr_1[N-2]) System.out.println("YES");
		       else System.out.println("NO");
		   }
		}
}
