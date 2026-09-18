import java.util.Scanner;
public class charactercheck {
  public static void main(String[] args) {
    System.out.print("Enter the character you want to check:");
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if (ch>='A' && ch<='Z' ) {
      System.out.println("This is captial letter"+ ch);
    }
    else if(ch>='a' && ch<='z'){
      System.out.println("This is small letter"+ ch);
    }
    else if (ch>=0 && ch<=9) {
      System.out.println("This is a number"+ ch);
    }
    else {
      System.out.println("This is a special character: "+ ch);
        }
    sc.close();
  }
}
