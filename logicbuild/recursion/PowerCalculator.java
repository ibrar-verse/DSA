import java.util.Scanner;

public class PowerCalculator {

    // Recursive method to calculate x^n
    public static int power(int x, int n) {
        // Base Case: Anything raised to the power of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive Case: x * x^(n - 1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);

        sc.close();
    }
}
