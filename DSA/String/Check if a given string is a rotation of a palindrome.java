class Solution
{
    int isRotatedPalindrome(String s)
    {
        // Your Code Here     
        int len=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<len;i++)
        {
            //left rotating by 1 position
            char temp=ch[0];
            for(int j=1;j<len;j++)
            {
                ch[j-1]=ch[j];
            }
            ch[len-1]=temp;
            String t1=new String(ch);
            boolean flag=true;
            
            //checking for palindrome
          //here instead of using the below logic , we can also use equals() method. But for that we need another reversed string to compare. Hence we need to 
          // reverse a given string and then compare with equals(), which takes more processing time [Time complexity is same: O(N) + O(N) = O(N)] 
          for(int j=0;j<len/2;j++)
            {
                if(t1.charAt(j)!=t1.charAt(len-j-1))//abcde
                {
                    flag=false;
                    break;
                }
            }
            if(flag) return 1;
        }
        return 0;
    }
    
}
