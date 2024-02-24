package Unit2;

import java.util.Scanner;


public class NewSwitch {
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String out;
        boolean exit = true;
        
        while (exit) {
            System.out.println("What was your grade in the last test?");
            int number = sc.nextInt();
            
            switch(number) {
                case 0, 1, 2, 3, 4 -> 
                    System.out.println("F");
                case 5 ->
                    System.out.println("D");
                case 6 -> 
                    System.out.println("C");
                case 7, 8 ->
                    System.out.println("B");
                case 9, 10 -> 
                    System.out.println("A");
            }
            
            System.out.println("Knowing your grade, choose a month"
                    + " (1-12) and I will tell you something funny");
            
            int month = sc.nextInt();
            
            boolean errorControl = true;
            while (errorControl) {
                if (!(1 <= month && month <= 12)) {
                    System.out.println("I said between 1 and 12. Try again: ");
                    month = sc.nextInt();
                } else {errorControl = false;}
            }
            
            int days = switch(month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield 31;
                }
                case 2 -> {
                    yield 28;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }
                default -> {
                    System.out.println("Error. Try again later");
                    yield -1;
                }
            };

            System.out.println("The month you've chosen has " + days + " days");
            
            System.out.println("Again? Y/N");
            sc.nextLine();
            out = sc.nextLine();
            exit = out.equalsIgnoreCase("Y") ? true : false;
        }
    }
}
