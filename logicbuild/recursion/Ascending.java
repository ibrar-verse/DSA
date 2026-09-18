import java.util.Scanner;
public class Ascending{
  public static void Ascend(int n){
    if(n==0){
      return;
    }
    Ascend(n-1);
    System.out.print(n + " ");
  }
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number to check the ascending order:");
  int n = sc.nextInt();
  Ascend(n);
  sc.close();
}
}
