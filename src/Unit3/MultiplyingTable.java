package Unit3;
import java.util.*;

public class MultiplyingTable {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Input a number between 1 and 10");
            num = sc.nextInt();
        } while (!(1 <= num && num <= 10)); // Make sure number is in between those two
        
        System.out.println("Multiplying table of number " + num);
        
        for (int i = 0; i <= 10; i ++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        
        System.out.println("\nNow we will do it in another way. Check this out");
        
        for (int i = 0; i <= 10; i ++) {
            System.out.println("Multiplying table of number " + i + "\n");
            for (int j = 0; j <= 10; j ++) {
                System.out.println(i + " x " + j + " = " + i *j);
            }
        }
    }
}
