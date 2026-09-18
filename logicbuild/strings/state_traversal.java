import java.util.Scanner;
public class state_traversal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();
    System.out.println("You entered: " + str);
    boolean inword = false;// State variable to track if we are inside a word
    int wordscount = 0;
    char[] chars = str.toCharArray();

for (int i = 0; i < chars.length; i++) {
    if (chars[i] == ' ') {
        inword = false;
    } else {
        if (!inword) {
            wordscount++;
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32); // Convert to uppercase directly
            }
            inword = true;
        }
    }
}
String result = new String(chars);
    System.out.println("Total words found: " + wordscount);
    System.out.println("String after converting first letter of each word to uppercase: " + result);
    sc.close();
  }
}

