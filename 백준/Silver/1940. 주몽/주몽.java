import java.util.*;

class Main {

  public static void main(String[] args)   {
    Scanner sc = new Scanner(System.in);
    int count = 0 ;
    int n = sc.nextInt(); // 재료의 개수 .. 
    int m = sc.nextInt(); // 갑옷을 만드는데 필요한 개수

    int [] k = new int[n];


    for(int i = 0; i < n; i++){
        k[i] = sc.nextInt();        
    }
    
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        if(k[i]+k[j] == m) 
          count++;
      }
    }

    System.out.println(count);
  }

}