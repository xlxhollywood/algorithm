import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] input = br.readLine().split(" ");

      long a = Long.parseLong(input[0]); // 밑 숫자
      long b = Long.parseLong(input[1]); // 지수
      long c = Long.parseLong(input[2]); // 모듈러

      System.out.println(remainder(a,b,c));

    }

    private static long remainder(long a, long b, long c){
      // 지수가 1이면 바로 나머지 구하기
      if(b == 1){
        return a % c;
      }

      // 지수가 1 이상이면 지수를 반으로 나누어 다시 나머지 구하기
      else {
        long halfVal = remainder(a, b / 2, c);
        // 지수가 홀수 일 때
        if(b % 2 == 1){
            return (halfVal * halfVal % c) * a % c;
        }

        // 지수가 짝수일 때
        return halfVal * halfVal % c;

      }
    }

}