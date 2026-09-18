import java.util.Scanner;

public class digitcomp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-9999): ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 9999) {
            int temp = num;
            int sum = 0;
            int product = 1; // Starts at 1 for multiplication

            // Loop through every digit until no digits remain
            while (temp > 0) {
                int digit = temp % 10;     // Extract last digit
                sum += digit;              // Add digit to total sum
                product *= digit;          // Multiply digit into total product
                temp /= 10;                // Drop the last digit
            }

            System.out.println("Digit Sum: " + sum);
            System.out.println("Digit Product: " + product);

            // Compare overall sum and product
            if (sum > product) {
                System.out.println("The sum of digits is GREATER than the product.");
            } else if (sum < product) {
                System.out.println("The sum of digits is LESS than the product.");
            } else {
                System.out.println("The sum of digits is EQUAL to the product.");
            }
        } else {
            System.out.println("Out of valid range (1-9999).");
        }

        sc.close();
    }
}