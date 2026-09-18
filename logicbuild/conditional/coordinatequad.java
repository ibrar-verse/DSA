import java.util.Scanner;
public class coordinatequad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the x-coordinate: ");
    int x = sc.nextInt();
    System.out.print("Enter the y-coordinate: ");
    int y = sc.nextInt();

    if (x > 0 && y > 0) {
      System.out.println("The point is in the first quadrant.");
    } else if (x < 0 && y > 0) {
      System.out.println("The point is in the second quadrant.");
    } else if (x < 0 && y < 0) {
      System.out.println("The point is in the third quadrant.");
    } else if (x > 0 && y < 0) {
      System.out.println("The point is in the fourth quadrant.");
    } else if(x==0 && y!=0) {
      System.out.println("The point is on the y-axis.");
    } else if(x!=0 && y==0) {
      System.out.println("The point is on the x-axis.");
    } else {
      System.out.println("The point is at the origin.");
    }
    sc.close();
  }
}
