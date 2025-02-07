import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
    
    Set<Integer> set = new HashSet<>();    
    int cnt = 0;
    int flag = 0;
    for(int i = 0; i < 10; i++){
        int n = Integer.parseInt(br.readLine());
        set.add(n % 42);
    }    
  
// 39 40 41 0 1 2 40 41 0 1 = 6개 ?? 중복만 없으면 되는거 아님 ?? 

    System.out.println(set.size());
  }

}