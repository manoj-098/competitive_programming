class HelloWorld {
    public static void main(String[] args) {
        
        //Method-1
        int LCM= (A*B) / gcd(A,B);
    }
    //Euclidean Method [With Recusrion]
        public static int gcd(int a, int b) {
        if (b == 0)     return a;
        return gcd(b, a % b);
    }
    
    //[ Without Recursion ]
     public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max;

        while (lcm % min != 0) 
            lcm += max;

        return lcm;
    }
    
    //[ With Recursion ]
    public static int lcm(int a, int b, int multiple) {
        if (multiple % b == 0) {
            return multiple;
        }
        return lcm(a, b, multiple + a);
    }
     public static int lcm(int a, int b) {
        return lcm(a, b, a);
    }
}
.
.
.
.
.
.
.
.
.
.
.
.
.   
//LCM of Array of Numbers
public class LCMOfArrayExample {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcmOfArray(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
            lcm = (lcm * numbers[i]) / gcd(lcm, numbers[i]);
        
        return lcm;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 3, 9, 4 };
        System.out.println("LCM of the array is: " + lcmOfArray(numbers));
    }
}
