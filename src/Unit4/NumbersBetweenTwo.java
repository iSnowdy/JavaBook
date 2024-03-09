package Unit4;
import java.util.Scanner;

public class NumbersBetweenTwo {
    public static void numbersInBetween (int numberOne, int numberTwo) {
        int min = numberOne > numberTwo ? numberTwo : numberOne;
        int max = numberOne > numberTwo ? numberOne : numberTwo;
        
        for (int i = min + 1; i < max; i ++) {
            System.out.println(i);
        }       
    }
    
    public static void main (String[] args) {
        System.out.println("Type in two numbers. I will then show you the numbers in between those");
        
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        
        numbersInBetween(numberOne, numberTwo);
    }
}
