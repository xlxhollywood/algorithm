import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
    Set<Integer> set = new HashSet<>();    

    for(int i = 0; i < 10; i++){
        int n = Integer.parseInt(br.readLine());
        set.add(n % 42);
    }    

    System.out.println(set.size());

  }

}