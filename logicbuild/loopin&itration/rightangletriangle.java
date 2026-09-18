import java.util.Scanner;
public class rightangletriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows for the right-angled triangle: ");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println(); // Move to the next line after each row
    }
    sc.close();
  }
}
