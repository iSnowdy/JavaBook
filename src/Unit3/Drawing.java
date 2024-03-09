package Unit3;
import java.util.*;

public class Drawing {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number. I will then draw a reversed triangle of that size");
        
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i ++) { // Rows
            for (int j = i; j < num; j ++) { // Columns
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        /*
        
        int counter = 0;
        
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 5; j ++) {
                counter ++;
            }
        }
        
        System.out.println(counter);

        */
    }
}
