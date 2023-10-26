/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		while(test-->0)
		{
		    int N=in.nextInt();
		    String s1=in.next();
		   int  sum=0;
		   String res="YES";
		    for(int i=0;i<N;i++)
		    {
		        if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o'&& s1.charAt(i)!='u')
		        {
		            sum++;
		        }
		        else sum=0;
		        
		        if(sum>=4)
		        {
		            res="NO";
		            break;
		        }
		    }
		    System.out.println(res);
		}
	}
}
