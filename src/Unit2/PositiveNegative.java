package Unit2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int number;
        boolean exit = true;
        String out;
        
        while (exit) {
            System.out.println("Type in a number and I will tell you if it is positive (true) or negative (false)");
            number = sc.nextInt();
            
            boolean output = number >= 0 ? true : false;
            System.out.println(output);
            
            System.out.println("Would you like to analyze another number? Y/N");
            sc.nextLine(); // Consume buffer created by another type of sc
            out = sc.nextLine();
            
            exit = out.equalsIgnoreCase("Y") ? true : false;
            
        }
    }
}
