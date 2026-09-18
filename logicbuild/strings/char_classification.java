import java.util.Scanner;
public class char_classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
       int uppercount=0;
       int lowercount=0;
       int digitcount=0;
       int specialcount=0;
    
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                uppercount++;
                System.out.println(ch + " is an Uppercase letter.");
            } else if(ch >= 'a' && ch <= 'z'){
                lowercount++;
                System.out.println(ch + " is a Lowercase letter.");
            } else if(ch >= '0' && ch <= '9'){
                digitcount++;
                System.out.println(ch + " is a Digit.");
            } else {
                specialcount++;
                System.out.println(ch + " is a Special character.");
            }
        }
        System.out.println("Uppercase letters: " + uppercount);
        System.out.println("Lowercase letters: " + lowercount);
        System.out.println("Digits: " + digitcount);
        System.out.println("Special characters: " + specialcount);
        sc.close();
    }
}