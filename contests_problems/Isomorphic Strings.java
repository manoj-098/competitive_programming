//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Isomorphic obj = new Isomorphic();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Isomorphic{
    public static boolean areIsomorphic(String S1,String S2)
    {
        if(S1.length()!=S2.length()) return false;
        char s1[]=new char[S1.length()];
        char s2[]=new char[S2.length()];
        for(int i=0;i<S1.length();i++)
        {
            s1[i]=S1.charAt(i);
            s2[i]=S2.charAt(i);
        }
        
        for(int i=0;i<s1.length-1;i++)
        {
            for(int j=0;j<s1.length;j++)
            {
                if(s1[i]==s1[j] && i!=j)
                {
                    if(s2[i]!=s2[j]) return false;
                }
                if(s1[i]!=s1[j] && i!=j)
                {
                    if(s2[i]==s2[j]) return false;
                }
            }
        }
       return true;
    }
}
