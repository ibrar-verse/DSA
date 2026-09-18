import java.util.Scanner;
public class Fibonacci {
  public static int fib(int n){
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else{
      return fib(n-1) + fib(n-2);
    }
  }
  public static void main(String[] args) {
    System.out.print("Enter the number of terms for Fibonacci series: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Fibonacci Series: ");
    for(int i=0;i<n;i++){
      System.out.print(fib(i) + " ");
    }
    System.out.println();
    sc.close();
  }
}
