// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("GCD: "+Method1(25,15));
    }
    //Euclidean Method [With Recusrion]
    static int Method1(int A, int B)
    {
        if (A == 0)
            return B;
        return GCD(B % A, A);
    }
    
    //Euclidean Method [Without Recusrion]
     public static int gcd(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }
    
    //Continuous Subtraction
    static int Method2(int A,int B)
    {
        if(A==0 || A==B) return B;
        if(B==0) return A;
        if(A>B) return GCD(A-B,B);
        else return GCD(A,B-A);
    }
}
