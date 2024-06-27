// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
public static void main(String[] args) {
// System.out.println("Try programiz.pro");
String s="I got intern at geeksforgeeks";
String[] str=s.split(" ");
for(int i=0;i<str.length;i++)
{
// String t1=String.valueOf(str[i].charAt(0)).toUpperCase();
str[i]=str[i].substring(0,1).toUpperCase()+str[i].substring(1);
}
System.out.println(Arrays.toString(str));
}
}
