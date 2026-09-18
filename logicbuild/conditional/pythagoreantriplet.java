import java.util.Scanner;
public class pythagoreantriplet {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first number:");
    int a=sc.nextInt();
    System.out.print("Enter the second number:");
    int b=sc.nextInt();
    System.out.print("Enter the third number:");
    int c=sc.nextInt();
    if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
    {
      System.out.println("The numbers form a Pythagorean triplet.");
    }
    else{
      System.out.println("The numbers do not form a Pythagorean triplet.");
    }
    sc.close();
  }
}
