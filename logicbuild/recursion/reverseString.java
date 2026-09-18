import java.util.Scanner;
public class reverseString {
  public static String Stringreversed(String str){
    if(str.length()<=1){
      return str;
    }
    return str.charAt(str.length()-1) + Stringreversed(str.substring(0,str.length()-1));
  }
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string to reverse:");
    String str = sc.nextLine();
    System.out.println("Reversed string: " + Stringreversed(str));
  }
}
