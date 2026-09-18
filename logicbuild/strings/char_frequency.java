import java.util.Scanner;
public class char_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        int[] freq=new int[256]; // Assuming ASCII character set
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i + " : " + freq[i]);
            }
        }
        sc.close();
    }
}