public class PowerOfNumberExample {
    public static double power(int base, int exponent) {
        double result = 1;
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        int base = 2, exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
    }
}
