import java.util.*;
import java.io.*;

class Main{

  public static void main(String [] args) throws IOException{
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0 ; i < n; i++){
      int total = 0;
      int cnt = 0;        
      String score = br.readLine(); // OOXXOXXOOO 입력        
        for(int j = 0; j < score.length(); j++){
          if(score.charAt(j) == 'O'){
            cnt++;
            total += cnt; 
          }
          else {
            cnt = 0;
          }
      }
      System.out.println(total);
    }
    
  }

}
