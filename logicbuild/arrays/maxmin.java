import java.util.Scanner;
public class maxmin{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("how many numbers want to check:");
  int num=sc.nextInt();
  System.out.println("Enter " + num + " elements in array");
  int[] arr = new int[num];
  for(int i=0;i<num;i++){
    arr[i]=sc.nextInt();
  }
  //max min and index
  int max=arr[0];
  int min=arr[0];
  int maxIndex=0;
  int minIndex=0;
  for(int i=1;i<num;i++){
    if(arr[i]>max){
      max=arr[i];
      maxIndex=i;
    }
    if(arr[i]<min){
      min=arr[i];
      minIndex=i;
    }
  }
  System.out.println("Maximum element is: "+max+" at index: "+maxIndex);
  System.out.println("Minimum element is: "+min+" at index: "+minIndex);
}
}
