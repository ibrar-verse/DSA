import java.util.Scanner;
public class reversearray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int num = sc.nextInt();
    int[] arr = new int[num];
    System.out.println("Enter " + num + " elements in the array:");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    int left = 0;
    int right = num - 1;
    while(left<right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    System.out.println("Array after reversing: ");
    for (int i = 0; i < num; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
