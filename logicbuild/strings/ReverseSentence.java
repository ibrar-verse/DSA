import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();
        
        // Step 1: Reverse the entire character array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        // Step 2: Reverse each word individually
        int wordstart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || i == arr.length - 1) {
                int wordend = (i == arr.length - 1) ? i : i - 1;
                
                // Reverse the current word
                while (wordstart < wordend) {
                    char temp = arr[wordstart];
                    arr[wordstart] = arr[wordend];
                    arr[wordend] = temp;
                    wordstart++;
                    wordend--;
                }
                wordstart = i + 1; // Move to the start of the next word
            }
        }

        System.out.println("Final Reversed Words: " + new String(arr));
        sc.close();
    }
}