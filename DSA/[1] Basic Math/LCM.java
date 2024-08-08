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
