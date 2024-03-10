package Unit5;
import java.util.Scanner;
import java.util.Arrays;


public class FillWithOdds { 
    public static int[] fillWithOdds (int length, int end) {
        int[] tableToFill = new int[length];
        int counter = 0;
        
        while (counter < length) {
            int temp = (int) (Math.random() * end + 1);
            if (temp % 2 == 0) {
                tableToFill[counter] = temp;
                counter ++;
            }
        }
        Arrays.sort(tableToFill);
        return tableToFill;
    }
    
    public static void main (String[] args) {
        int length = 10;
        int end = 50;
        System.out.println(Arrays.toString(fillWithOdds(length, end)));
    }
}
