import java.util.*;

class Main {

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      // 정적 배열 선언 
      int [] numbers = new int[n+1];
      int [] pSum = new int[n+1];

      // 구간 합 배열 만들기
      for(int i = 1 ; i <= n; i++){
      // ex) 1, 2, 3, 4, 5
      numbers[i] = sc.nextInt();
      // pSum[1] = 0 + 1 , pSum[2] = 1 + 2,  pSum[3] = 3 + 3
      pSum[i] = pSum[i-1] + numbers[i];
      }

      // i,j 입력 받은 후 입력 받은 구간 합 구하기
      for (int k = 0; k < m; k++){
      int i = sc.nextInt();
      int j = sc.nextInt();
      /* 
       2,4 입력시 , pSum[4] - pSum[1] 
       pSum[2]가 아닌 이유는 2 이전에 있는 배열의 원소들을 빼야 되기 때문이다
       ex) 0, 1, 2, 3, 4, 5
                <------->
                 2 + 3 + 4 = 9
       ex) 0, 1, 3, 6, 10, 15
           <------------>
           <--->         
                 10 - 1 = 9
        */
      int sum = pSum[j] - pSum[i-1];
      System.out.println(sum);
      }

  

      
      
      
  }
  
}
