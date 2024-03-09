package Unit4;
import java.util.Scanner;
import java.util.Locale;
import static Unit4.ListOfPrimeNumbers.primeNumber; // import from another class

public class basicCalculator {
    public static double basicCalculator (double numberA, double numberB, int operation) {
        double result;
        
        result = switch(operation) {
            case 1 -> {
                result = numberA + numberB;
                System.out.println("This is an addition. " + numberA + " + " + numberB + " = " + result);
                yield result;
            }
            case 2 -> {
                result = numberA - numberB;
                System.out.println("This is a subtraction. " + numberA + " - " + numberB + " = " + result);
                yield result;
            }
            case 3 -> {
                result = numberA * numberB;
                System.out.println("This is a multiplication. " + numberA + " * " + numberB + " = " + result);
                yield result;
            }
            case 4 -> {
                result = (double) numberA / numberB;
                System.out.println("This is a division. " + numberA + " / " + numberB + " = " + result);
                yield result;
            }
            case 5 -> {
                System.out.println("Are they prime numbers?");
                System.out.println("Is " + numberA + " a prime number? " + primeNumber((int) numberA));
                System.out.println("Is " + numberB + " a prime number? " + primeNumber((int) numberB));
                yield -1;
            }
            default -> {
                System.out.println("Operation not valid");
                yield 0;
            }
        };
        return result;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Type in two numbers. I will show you what I can do :)\nOh and make sure you add decimals! Example: 4.0 or 4.4 ");
        double numberA = sc.nextDouble();
        double numberB = sc.nextDouble();
        
        for (int i = 1; i <= 5; i ++) basicCalculator(numberA, numberB, i); // Like this we execute the function in every way possible
    }
}
