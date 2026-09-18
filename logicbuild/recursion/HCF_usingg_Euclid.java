import java.util.Scanner;
public class HCF_usingg_Euclid {
  public static int Euclid(int a,int b){
    //always b value must small 
    if(b==0){
      return a; // Base Case: If b is 0, return a as the HCF
    }
    // Recursive Case: Call Euclid with b and the remainder of a divided by b
    return Euclid(b,a%b);

  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    Euclid(a,b);
    System.out.println("The HCF of "+a+" and "+b+" is: "+Euclid(a,b));
}
}
