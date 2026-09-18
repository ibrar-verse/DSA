import java.util.Scanner;
public class firstandlastoccurance {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many numbers want to check:");
    int num=sc.nextInt();
    System.out.println("Enter " + num + " elements in array");
    int[] arr = new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the number to find first and last occurrence:");
    int target=sc.nextInt();
    int firstIndex=-1;
    int lastIndex=-1;
    for (int i = 0; i < num; i++) {
    if (arr[i] == target) {
        if (firstIndex == -1) {
            firstIndex = i;
        }
        lastIndex = i;
    }
}
    System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
    System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
}
}
