import java.util.Scanner;
public class two_pointer_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
        // If left is NOT a letter, skip it:
if (!((arr[left] >= 'a' && arr[left] <= 'z') || (arr[left] >= 'A' && arr[left] <= 'Z'))) {
    left++;
} 
// If right is NOT a letter, skip it:
else if (!((arr[right] >= 'a' && arr[right] <= 'z') || (arr[right] >= 'A' && arr[right] <= 'Z'))) {
    right--;
} 
// Both are letters -> SWAP!
else {
    char temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
}
        }
        System.out.println("String after swapping 'a' and 'z': " + new String(arr));
        sc.close();
    }
}
