package Unit3;
import java.util.*;

public class Factorial {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me a number and I will math out its factorial");
        
        int number = sc.nextInt();
        int factorial = 1;
        
        for (int i = number; i >= 1; i --) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
