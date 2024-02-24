
package Unit1;

import java.util.Scanner;
import java.util.Locale;

public class Fruits {
    public static void main (String[] args) {
        
        double appleFirst, pearFirst, appleSecond, pearSecond;
        final double APPLEPRICE = 2.35; // Constants are declared in upper case in Java
        final double PEARPRICE = 1.95;
        
        System.out.println("We will now calculate your annual profits for your fruit store");
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Type in how many apples and pears did you sell the first semester (in kilos)");
        appleFirst = input.nextDouble();
        pearFirst = input.nextDouble();
        
        System.out.println("Thank you. Now for the second semester?");
        appleSecond = input.nextDouble();
        pearSecond = input.nextDouble();
        
        double profit = ((appleFirst + appleSecond) * APPLEPRICE) + ((pearFirst + pearSecond) * PEARPRICE);
        System.out.println(profit);
        profit = (Math.round(profit * 100.0) / 100.0); // Rounded to 2 decimals
        
        System.out.println("Perfect. Taking into account that the price for your fruits is "
                + "2.35$/kilo and 1.95$/kilo, your annual profit has been of: " + profit + " dollars");
        
        
        
        
    }
    
}
