import java.util.Scanner;
public class descending {
  public static void Descend(int n){
    if(n==0){
      return;
    }
    System.out.print(n + " ");
    Descend(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to check the descending order:");
    int num = sc.nextInt();
    Descend(num);
    sc.close();
  }
}
