package javabook;

import java.util.Scanner;

public class AquaPark {
    public static void main (String[] args) {
        
        int adultCount, kidCount;
        double totalPrice;
        final int ADULTPRICE = 20;
        final double KIDPRICE = 15.5;
        final double DISCOUNT = 5;
        boolean discount = true;
        String out;
        boolean exit = false;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello there!\n We welcome you to our new Aqua Park.\n"
                + "You will need to proceed one by one. All we need is how many adults and"
                + "kids are in your group.");
        
        while (!exit) {
            
            System.out.println("Welcome once again. How many adults and kids are in your group?");
            adultCount = input.nextInt();
            kidCount = input.nextInt();
            input.nextLine(); // To consume buffer line
            totalPrice = (double) (adultCount * ADULTPRICE) + (kidCount * KIDPRICE);
            
            discount = (totalPrice = totalPrice < 100.0 ? totalPrice : totalPrice * (discount ? (1.0 - DISCOUNT / 100.0) : 1.0)) < 100.0;
            
            
            System.out.println("Thank you for your patience. Considering there are " + adultCount + 
                    " adults and " + kidCount + " kids, the total price you will be paying is " + totalPrice +"$");
            
            System.out.println(totalPrice >= 100 ? "Oh by the way. Since the total amount you are paying is over 100$, we applied a 5% discount to it" : 
                    " ");
            
            System.out.println("Good bye! And enjoy the themed park\n"
                    + "Next one in line please (...)\n Continue? Y/N");
            
            out = input.nextLine();
            exit = out.equalsIgnoreCase("Y") ? false : true;
         
        }
        
        System.out.println("Peace out");
    }
}
