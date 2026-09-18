import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Phase 1: Shift all non-zero elements to the front
        int count = 0; // Tracks the position for the next non-zero element
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Phase 2: Fill the rest of the array with zeroes
        while (count < size) {
            arr[count] = 0;
            count++;
        }

        // Print the result
        System.out.println("Array after moving zeroes to the end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
