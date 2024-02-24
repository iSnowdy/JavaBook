package Unit2;

import java.util.Scanner;

public class DiffNumbersAndMultiple {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String outLoop;
        int firstNumber;
        int secondNumber;
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Type in two numbers and I will tell you if they are different or not"
                    + "\nAnd also whether any of them is 0");
            
            System.out.println("Finally you will know if the first number is a multiple of the second one");
            
            System.out.println("Type in the first number you want to analyze: ");
            firstNumber = sc.nextInt();
            
            System.out.println("Now type in the second number you would like to analyze: ");
            secondNumber = sc.nextInt();
            
            if (firstNumber != secondNumber || firstNumber == 0 || secondNumber == 0) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
            
            if (!(secondNumber == 0)) {
                boolean multipleOf = firstNumber % secondNumber == 0 ? true : false;
                System.out.println("Is " + firstNumber + " a multiple of " + secondNumber + "\nThe answer is ... " + multipleOf);
            }
            
            System.out.println("Bonus info: are they even or odd?");
            
            boolean firstNumberBonus = (firstNumber % 2 == 0) ? true : false;
            boolean secondNumberBonus = (secondNumber % 2 == 0) ? true : false;
            
            System.out.println("First number is even? " + firstNumberBonus + "\n"
                    + "Second number is even? " + secondNumberBonus);
            
            
            System.out.println("And thats it. Would you like to analyze another pair of numbers? Y/N");
            sc.nextLine();
            outLoop = sc.nextLine();
            
            exit = outLoop.equalsIgnoreCase("Y") ? false : true;
            
        }
    }
}
