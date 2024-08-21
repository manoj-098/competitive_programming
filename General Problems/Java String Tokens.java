import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        ArrayList<String> list = new ArrayList<>();
        String temp="";
        int flag1=0,flag2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' ||s.charAt(i)=='!' ||s.charAt(i)==',' ||s.charAt(i)=='?' ||s.charAt(i)=='.' ||s.charAt(i)=='_' ||s.charAt(i)=='\'' ||s.charAt(i)=='@')
            {
                if(flag1==1 && flag2==1)
                {
                    list.add(temp);
                    temp="";
                }
                flag1=0;
                
            }
            else{
                flag2=1;
                temp+=s.charAt(i);
                flag1=1;
                if(i==s.length()-1) list.add(temp);
        }   
    }
    System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
}
}

