package Unit4;
import java.util.Scanner;
import java.util.ArrayList;

public class ListOfPrimeNumbers {
    public static boolean primeNumber (int number){
        if (number <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(number); i ++) {
            if (number % i == 0) return false;
        }
        
        return true;
    }
    
    public static void main (String[] args) {
        System.out.println("How many numbers would you like to know if they are prime or not? ");
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> primeArray = new ArrayList<>();
        ArrayList<Integer> notPrimeArray = new ArrayList<>();
        
        int number = sc.nextInt();
        for (int i = 0; i <= number; i ++) {
            if (primeNumber(i)) {
                System.out.println("The number " + i + " is a primer number");
                primeArray.add(i);
            } else {
                System.out.println("The number " + i + " is not a primer number");
                notPrimeArray.add(i);
            }
        }
        System.out.println("\nYour prime numbers, are, in a list: \n");
        for (int i = 0; i < primeArray.size(); i ++) {
            System.out.print(primeArray.get(i));
            System.out.print(" ");
        }
        
        System.out.println("\n\nYour non prime numbers, are, in a list: \n");
        for (int i = 0; i < notPrimeArray.size(); i ++) {
            System.out.print(notPrimeArray.get(i));
            System.out.print(" ");
        }
    }
}
