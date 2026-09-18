 import java.util.Scanner;
 public class leftrotate {
  public static void main(String[] args){
 System.out.println("Enter the size of the array:");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter " + size + " elements in the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int first=arr[0];
    for(int i=0;i<size-1;i++){
      arr[i]=arr[i+1];
    }
    arr[size-1]=first;
    System.out.println("Array after left rotation: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
