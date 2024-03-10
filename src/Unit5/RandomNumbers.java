package Unit5;
import java.util.Scanner;
import java.util.Arrays;


public class RandomNumbers { 
    public static void main (String[] args) {
        int[] randomNumbers = new int[100];
        for (int i = 0; i < randomNumbers.length; i ++) {
            randomNumbers[i] = (int) (Math.random()*100 + 1); // max 100 min 1
        }
        int sum = 0;
        for (int number : randomNumbers) {
            if (number == 0) System.out.println("0");
            if (number == 1) System.out.println("1");
            if (number == 99) System.out.println("99");
            if (number == 100) System.out.println("100");
            sum += number;
        }
        System.out.println(sum);
        
        int[] inputNumbers = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < inputNumbers.length; i ++) {
            System.out.println("Type in the " + (i + 1) + " number: ");
            inputNumbers[i] = sc.nextInt();
        }
        
        System.out.println("Your numbers were:");
        System.out.println(Arrays.toString(inputNumbers));
        
        int max = inputNumbers[0]; // At least one number
        
        for (int number : inputNumbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The max number you typed in was: " + max);
        Arrays.sort(inputNumbers);
        System.out.println("The table sorted is: " + Arrays.toString(inputNumbers));
    }
}
