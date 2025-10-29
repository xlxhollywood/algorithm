import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next(); 
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder sbB = new StringBuilder(B);


        int revA = reverse(sbA);
        int revB = reverse(sbB);


        System.out.println(Math.max(revA,revB));
    }

    static int reverse(StringBuilder A){
        char tmp = A.charAt(0);
        A.setCharAt(0, A.charAt(2));
        A.setCharAt(2, tmp);
                
        
        return Integer.parseInt(A.toString());
        
    }

    

    
}