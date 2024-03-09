package Unit3;
import java.util.Scanner;

public class FirstPairs {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("We will show you the sum of the first n odd numbers. n being your input");
        
        int size = sc.nextInt();
        int sumOfOdds = 0;
        
        for (int i = 1; i <= size; i ++) {
            int odd = (2 * i) - 1;
            System.out.println(odd);
            sumOfOdds += odd;
        }
        System.out.println("The result is: " + sumOfOdds);
    }
}
