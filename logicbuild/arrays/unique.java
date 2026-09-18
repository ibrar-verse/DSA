import java.util.Scanner;
public class unique{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many numbers want to check:");
    int num=sc.nextInt();
    System.out.println("Enter " + num + " elements in array");
    int[] arr=new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    boolean isUnique=true;
    for(int i=0;i<num-1;i++){
      for(int j=i+1;j<num;j++){
     if(arr[i]==arr[j]){
      isUnique=false;
     }
      }
    }
    if(isUnique){
      System.out.println("All elements in the array are unique.");
    } else {
      System.out.println("Array contains duplicate elements.");
    }
  }
}