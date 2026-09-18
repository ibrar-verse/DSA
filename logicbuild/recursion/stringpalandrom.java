import java.util.Scanner;

public class stringpalandrom {

    public static boolean isPalindrome(String str) {
        // Base Case: 0 or 1 character left means all character pairs matched
        if (str.length() <= 1) {
            return true;
        }

        // Check if outer characters do not match
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive Step: Trim first and last characters and check inner substring
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
