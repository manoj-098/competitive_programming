//A Strong Number is a number in which the sum of the factorials of its digits is equal to the number itself.
//Example:
//145 is a Strong Number because 145 = 1!+4!+5! = 1+24+120 = 145.

public class StrongNumberExample {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 145;
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
    }
}
