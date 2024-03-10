package Unit4;
import java.util.Scanner;

public class RecursiveFunction {
    public static long factorialThisNumber (long number) {
        long result;
        
        if (number == 0) {
            result = 1;
        } else {
            result = number * factorialThisNumber(number - 1);
        }
        return result;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a number and I will do the factorial of it ");
        long number = sc.nextLong();
        System.out.println(factorialThisNumber(number));
    }
}
