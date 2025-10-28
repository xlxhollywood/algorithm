import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        for(int i = 1 ; i <= 30; i++ ){
            A.add(i);
        }

        for(int i = 0 ; i < 28; i++){
            int input = sc.nextInt();
            B.add(input);
        }

        A.removeAll(B);
        
        for(int n : A){
            System.out.println(n);
        }

    }
}