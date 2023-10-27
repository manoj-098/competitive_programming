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
		Scanner in =new Scanner(System.in);
		int test =in .nextInt();
		while(test-->0)
		{
		    int N=in.nextInt();
		    int mod=N%10;
		    if(mod>=5){
		        mod=10-mod;
		        N+=mod;
		    }
		    else{
		        N=N-mod;
		    }
		    System.out.println(100-N);
		}
	}
}
