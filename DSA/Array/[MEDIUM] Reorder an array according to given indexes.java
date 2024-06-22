// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int arr[]   = {50,40,70,60,90};
        int index[] = {3,0,4,1,2};
        int i=0;
        while(i<index.length)
        {
            int crct=index[i];
            if(index[crct]!=index[i])
            {
                int temp1=arr[i];
                arr[i]=arr[crct];
                arr[crct]=temp1;
                
                int temp2=index[i];
                index[i]=index[crct];
                index[crct]=temp2;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));
    }
    
}
