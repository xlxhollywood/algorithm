import java.util.Arrays;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr [] = new int[3];
    

    while(true){
      arr[0] = sc.nextInt();
      arr[1] = sc.nextInt();
      arr[2] = sc.nextInt();
      
      Arrays.sort(arr);
    
      if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
        break;

      if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
        System.out.println("right");
         else 
          System.out.println("wrong");
        
      }
    }
} 

