// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="geeg";
        Map<String, Integer> map=new LinkedHashMap<>();
        for(int start=0;start<str.length();start++)
        {
            for(int end=start;end<str.length();end++)
            {
                String str1=str.substring(start,end+1);
                char[] ch=str1.toCharArray(); // sorting the string , so that 
                // ge and eg becomes similar.i.e: it avoid the need of reversing the string and checking the frequency.
                Arrays.sort(ch);
                String s1=new String(ch);
                map.put(s1,map.getOrDefault(s1,0)+1);
            }
        }
        
        int count=0;
        for(Map.Entry<String, Integer> m:map.entrySet())
        {
            count+=(m.getValue()*(m.getValue()-1))/2;
        }
        System.out.println(count);
    }
}
