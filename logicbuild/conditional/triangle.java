import java.util.Scanner;
public class triangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.print("Enter the first side length of traingle:");
   int a=sc.nextInt();
   System.out.print("Enter the second side length of traingle:");
   int b=sc.nextInt();
   System.out.print("Enter the third side length of traingle:");
   int c=sc.nextInt();
   if(a+b>c && a+c>b && b+c>a){
    System.out.println("The triangle is valid");
    if(a==b && b==c){
      System.out.println("Eqaulance");
    }
    else if(a==b || b==c || c==a){
      System.out.println("isocless");
    }
    else{
      System.out.println("Scalar");
    }
   }
   sc.close();
  }
}
