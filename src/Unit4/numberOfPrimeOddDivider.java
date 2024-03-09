package Unit4;
import java.util.Scanner;
import java.util.ArrayList;
import static Unit4.ListOfPrimeNumbers.primeNumber; // import from another class

public class numberOfPrimeOddDivider {
    public static int oddPrimeCounter (int number){
        int counter = 0;
        
        for (int i = 1; i < number; i ++) {
            if (primeNumber(i) && number % i == 0) {  // We already defined the primeNumber function in another .java
                System.out.println(i + " is one of them");
                counter ++;
            }
        }
        
        return counter;
    }
    
    public static void main (String[] args) {
        System.out.println("Of what dividend would you like to how many prime odd divisors it has? ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int a = 2;
        int b = 3;
        
        // System.out.println("Trying " + (a + b) + " this" );
        
        System.out.println("Dividend " + number + " has " + oddPrimeCounter(number) + " prime divisors.");
    }
}
