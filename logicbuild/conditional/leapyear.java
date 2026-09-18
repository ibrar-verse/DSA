import java.util.Scanner;
public class leapyear{
public static void main(String[] args) {
    System.out.println("Enter a year: ");
   Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    System.out.println("The year is: "+year);
    if (year % 4 == 0 && year%100!= 0|| year % 400 == 0){
   System.out.println("The year is a leap year."+year);
    }
    else{
      System.out.println("The year is not a leap year."+year);
    }
    sc.close();
    }
  }
