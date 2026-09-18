import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();
        
        int count = 0;
        int temp = num;

        // Step 1: Count total digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        // Step 2: Compute sum of (digit ^ count)
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count); // Explicit cast to int
            temp /= 10;
        }

        // Step 3: Verify
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
