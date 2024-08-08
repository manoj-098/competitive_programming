// A Perfect Number is a number that is equal to the sum of its proper divisors (excluding itself).
// Example: 28 is a Perfect Number because the sum of its divisors (1, 2, 4, 7, 14) is 28 .i.e: 28 = 1+2+4+7+14 = 28.

public class PerfectNumberExample {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
}

