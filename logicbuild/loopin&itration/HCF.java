import java.util.Scanner;
public class HCF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a= sc.nextInt();
    System.out.print("Enter the second number: ");
    int b= sc.nextInt();
    while(a!=b){
      //if a is greater than b, subtract b from a; if b is greater than a, subtract a from b; if they are equal, break the loop
      if(a>b){
        a=a-b;
      }
      else if(a<b){
        b=b-a;
      }
      else{
        break;
      }
    }
    System.out.println("HCF is: "+a);
    sc.close();
}  
}
