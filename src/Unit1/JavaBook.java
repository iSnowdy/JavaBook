package Unit1;

import java.util.Locale;
import java.util.Scanner;

public class JavaBook {
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        byte a = 127;
        a = (byte) (a + 1);
        System.out.println(a);
        
        /* 
        
        The result of 'a' should be 128 in theory, but it is -128. This is because it goes out of memory. 
        A byte type of data can store numbers from -128 to 127. So when it goes beyond 127, it resets back
        to the start; which in this case is -128.
        
        */
        
        System.out.println("----------");
        
        java.time.LocalDateTime whatTime = java.time.LocalDateTime.now(); 
        System.out.println(whatTime);
        // An example of how to use Java API. Or its packages/classes without the need to import them
        
        System.out.println("----------");
        
        int square = (int) Math.sqrt(16); 
        System.out.println(square); // Example of a static class which does not need the "new" word for it
        Scanner input = new Scanner(System.in); // Once we create the Scanner "input" we can reutilize it however many times we want. Even for other type of data
        // And this would be a non static class. Those that we must first create with "new"
        /*
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Copy. Hello there " + name);
        System.out.println("What is your age? ");
        int age = input.nextInt();
        System.out.println("Copy. You are " + age + " years old");
        System.out.println("Finally. How tall are you? ");
        input.useLocale(Locale.US); // With this we can input numbers with "." instead of ",". So for example 1.82 instead of 1,82
        double height = input.nextDouble();
        System.out.println("And you are " + height + " tall.");
        */
        
        System.out.println("----------");
        
        int l, m, n;
        l = 1;
        m = l ++; // Like this assign l to m, then add up (so 1 = m -> l++)
        n = ++ l; // However like this we give priority to the addition. Therefore it is l ++, n = l
        System.out.println("The results are: " + l + ", " + m + ", " + n);

        
        
        
        
        
        
    }
    
}
