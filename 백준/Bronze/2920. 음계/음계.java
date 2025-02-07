import java.util.*;
import java.io.*;

class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();  // 입력을 읽기
    String[] input = line.split(" ");  // 공백을 기준으로 나누기
    int [] melody = new int[8];
    int cnt = 0;

    for(int i = 0 ; i < 8; i++){
      melody[i] = Integer.parseInt(input[i]); // 변환 후 배열에 저장
    }
    
    //
    for(int i = 0 ; i < 7 ; i++){
      if(melody[i] - melody[i+1] == -1 ){
          cnt++;
      }
      else if(melody[i] - melody[i+1] == 1){
          cnt--;
      }
    }

    if(cnt == 7)
      System.out.println("ascending");
    else if(cnt == -7)
      System.out.println("descending");
    else
      System.out.println("mixed");
    
  }

}