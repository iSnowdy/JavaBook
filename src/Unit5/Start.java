package Unit5;
import java.util.Scanner;
import java.util.Arrays;


public class Start { 
    public static void main (String[] args) {
        int[] numbers = new int [5];
        System.out.println(numbers.length);
        for (int number : numbers) System.out.println(number);
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int number : numbers) System.out.println(number);
        System.out.println(numbers.length);
        System.out.println("--------");
       
        Arrays.fill(numbers, 0, 3, 69); // Fills the table from index 0 to 3 (not included) with 69
        
        for (int number : numbers) {
            System.out.println(number);
            number --;
        }
        System.out.println("hey");
        for (int number : numbers) System.out.println(number);
    }
}
