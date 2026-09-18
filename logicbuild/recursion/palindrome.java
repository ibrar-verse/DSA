import java.util.Scanner;
public class palindrome{
  public static int pal(int n, int rev) {

    if (n == 0) {
      return rev; // Base Case: No digits left, return accumulated reversed number
    }
    // Extract last digit and push it into rev, then process remaining digits
    return pal(n/ 10, rev * 10 + (n % 10));
  }
  public static void main(String args[]){
System.out.println("Enter the number you want to check if it is palindrome");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
  if(a==pal(a, 0)){
    System.out.println("The number is palindrome");
  }
  else{
    System.out.println("The number is not palindrome");
  }
  sc.close();
}
}