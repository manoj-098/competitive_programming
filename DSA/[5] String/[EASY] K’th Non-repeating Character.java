// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = 3;
        fun(str,k);
    }
    
    public static void fun(String str, int k)
    {
        Map<Character, Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        
        int count=0;
        for(Map.Entry<Character, Integer> m:map.entrySet())
        {
            if(m.getValue()==1)
                count++;
            if(count==k)
            {
              System.out.println("ANS: "+m.getKey());  
              return;
            }
        }
        System.out.println("CHARACTER DOESN'T EXIST");
    }
}
