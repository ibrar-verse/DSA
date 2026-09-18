import java.util.Scanner;
public class primenumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it's prime: ");
    int num = sc.nextInt();
    boolean isPrime = true;
    if (num <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i*i <= num; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    
    if (isPrime) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
    sc.close();
  }
}
