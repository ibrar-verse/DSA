import java.util.Scanner;
public class strongnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it's a strong number: ");
    int num = sc.nextInt();
    int originalNum=num;
    int sum=0;
    while(num!=0){
      int digit=num%10;
      int fact=1;
      for(int i=1;i<=digit;i++){
        fact=fact*i;
      }
      sum+=fact;
    num=num/10;
    }
    if(sum==originalNum){
      System.out.println(originalNum+" is a strong number.");
    }
    else{
      System.out.println(originalNum+" is not a strong number.");
      sc.close();
    }
  }
}
