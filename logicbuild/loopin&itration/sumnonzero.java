import java.util.Scanner;
public class sumnonzero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 5 numbers: ");
    int sum=0;
    for(int i=1;i<=5;i++){
      int num=sc.nextInt();
      if(num==0){
        System.out.println("Zero is not allowed. Please enter a non-zero number.");
        continue; // Skip the rest of the loop and prompt for the next number
      }
      else{
        System.out.println("You entered: " + num);
      }
      sum+=num;
    }
    System.out.println("The sum of the entered numbers is: " + sum);
  }
}