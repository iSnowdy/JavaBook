package Unit3;
import java.util.*;

public class Digits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me a number and I will spell it for you backwards");
        
        int number = sc.nextInt();
        int numberTwo = number;
        int reversed = 0;
        
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        System.out.println(reversed);
        
        String numberString = Integer.toString(numberTwo);
        
        for (int i = numberString.length() - 1; i >= 0; i --) {
            System.out.println(numberString.charAt(i));
        }
    }
}
