import java.util.Scanner;
public class median {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the first number:");
  int a=sc.nextInt();
  System.out.print("Enter the second number:");
  int b=sc.nextInt();
  System.out.print("Enter the third number:");
  int c=sc.nextInt();
  if((a>b && a<c) || (a>c && a<b)){
    System.out.println("The median is: " + a);
  }
  else if((b>a && b<c) || (b>c && b<a)){
    System.out.println("The median is: " + b);
  }
  else{
    System.out.println("The median is: " + c);
  }
  sc.close();
}
}
