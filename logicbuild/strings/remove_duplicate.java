import java.util.Scanner;
public class remove_duplicate {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();
    System.out.println("You entered: " + str);
    boolean[] seen = new boolean[256]; // Assuming ASCII character set
    StringBuilder result = new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(!seen[ch]){
        seen[ch] = true;
        result.append(ch);
      }
    }
    System.out.println("String after removing duplicates: " + result.toString());
    sc.close();
  }
}
