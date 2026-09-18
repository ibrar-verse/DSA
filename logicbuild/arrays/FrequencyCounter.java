import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input the size and elements of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. Find the maximum element to size the frequency array properly
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 3. Create the frequency bucket array (size = max + 1)
        int[] freq = new int[max + 1];

        // 4. Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // 5. Print the frequency of each distinct number
        System.out.println("Element frequencies:");
        for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
