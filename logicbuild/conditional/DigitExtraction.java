import java.util.Scanner;
public class DigitExtraction {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a 3 digit number: ");
    int num=sc.nextInt();
    int digit1=num%10;//extracting the last digit
    int digit2=num/100;//extracting the first digit
    int digit3=(num/10)%10;//extracting the second digit
    if(digit3>digit1 && digit3>digit2){
      System.out.println("Middle digit is the largest digit: " + digit3);
    }
    else if(digit3<digit1 && digit3<digit2){
      System.out.println("Middle digit is the smallest digit: " + digit3);
    }
    else{
      System.out.println("Middle digit is neither the largest nor the smallest digit: " + digit3);
    }
    sc.close();
  }
}
