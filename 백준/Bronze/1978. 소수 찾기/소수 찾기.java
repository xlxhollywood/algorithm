import java.util.Arrays;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 0;

      for(int i = 0 ; i < n; i++){
        int snum = sc.nextInt();
        if(isPrime(snum)){
          cnt++;
        }
      }

      System.out.println(cnt);
    }
    
    
    public static boolean isPrime(int snum) {
      if(snum < 2) 
        return false;
      
      for(int i = 2; i * i <= snum ; i++){
        if(snum % i == 0)
          return false;
      }        

      return true;              
    } 
}
