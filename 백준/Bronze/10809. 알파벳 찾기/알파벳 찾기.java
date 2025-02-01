import java.util.*;

class Main {
  public static void main(String [] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String word = sc.nextLine();
    int [] alphabet = new int[26];

    // ✅ 모든 요소를 -1로 초기화 
    Arrays.fill(alphabet, -1);  
      
    // baekjoon  charat(i) = b = alphabet[b - 'a'] = i
    //            charat(2) = a = alphabet[a - 'a'] = 2 
    // alphapbet[0] = 1
    // alphapbet[1] = 0 
    // 알파벳 배열에는 word의 몇 번째로 문자로 들어갔는지 들어가 있어야함.

    for(int i = 0; i < word.length(); i++){
      if(alphabet[word.charAt(i) - 'a'] == -1){
      alphabet[word.charAt(i) - 'a'] = i;
      }
    }

    for(int i = 0; i < alphabet.length; i++){
      System.out.print(alphabet[i] + " ");
    }
      System.out.println();
  }
}