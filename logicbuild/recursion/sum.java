import java.util.Scanner;

public class sum {

    // Method MUST be inside the class body
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int result = n + sum(n - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to sum: ");
        int n = sc.nextInt();
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum(n));
        sc.close();
    }
}
