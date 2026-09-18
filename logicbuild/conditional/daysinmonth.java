import java.util.Scanner;
public class daysinmonth {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the month (1-12): ");
    int month=sc.nextInt();
    int days=0;
   if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
     days=31;
   }
   else if(month==4 || month==6 || month==9 || month==11){
     days=30;
   }
   else if(month==2){
     days=28;
   }
   else{
     System.out.println("Invalid month");
   }
   sc.close();
   System.out.println("The number of days in the month is: "+days);
  }

}
