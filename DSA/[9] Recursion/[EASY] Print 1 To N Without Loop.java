//GFG : https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N==0) return;
        printNos(N-1);
        System.out.print(N+" ");
    }
