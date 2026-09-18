import java.util.Scanner;
public class small_large {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int minDigit=9;
    int maxDigit=0;
    while(n>0){
      int digit=n%10;
      if(digit<minDigit){
        minDigit=digit;
      }
      if(digit>maxDigit){
        maxDigit=digit;
      }
      n=n/10;
}
System.out.println("Smallest digit is: "+minDigit);
    System.out.println("Largest digit is: "+maxDigit);
sc.close();
  }
}

