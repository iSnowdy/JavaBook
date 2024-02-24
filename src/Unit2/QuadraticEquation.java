
package Unit2;

import java.util.Scanner;
import java.util.Locale;


public class QuadraticEquation {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double a, b, c;
        boolean exit = false;
        String out;
        
        while (!exit) {
            
            double d, x1, x2;
            
            System.out.println("We will now do a quadratic equation\n"
                    + "For that I will need 3 numbers: a, b and c in that order\n"
                    + "Please take into account that a must not be 0");
            
            a = sc.nextInt();
            
            boolean zeroControl = true;
            while (zeroControl) {
                if (a == 0) {
                    System.out.println("a must not be 0");
                    a = sc.nextInt();
                } else {zeroControl = false;}
            }
            
            b = sc.nextInt();
            c = sc.nextInt();
            
            d = (b * b - 4 * a * c);
            System.out.println(d);
            
            if (d < 0) {
                System.out.println("For those numbers its impossible to calculate the quadratic equation");
            } else {
                x1 = Math.round((-b + Math.sqrt(d)) / (2 * a) * 1000.0) / 1000.0;
                x2 = Math.round((-b - Math.sqrt(d)) / (2 * a) * 1000.0) / 1000.0;
                
                System.out.println("Solution 1 (+) is " + x1);
                System.out.println("Solution 2 (-) is " + x2);
            }
            
            System.out.println("Would you like to run another script? Y/N");
            
            sc.nextLine();
            out = sc.nextLine();
            
            exit = out.equalsIgnoreCase("Y") ? false : true;
        }
    }
}
