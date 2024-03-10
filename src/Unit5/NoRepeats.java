package Unit5;
import java.util.Scanner;
import java.util.Arrays;
import static Unit5.BinarySearch.myBinarySearch;


public class NoRepeats { 
    public static int[] fillWithOdds (int[] inputArray) {
        int tempArray [] = new int[0];
        
        for (int number : inputArray) {
            if (myBinarySearch(tempArray, number) < 0) { // Element not found
                tempArray = Arrays.copyOf(tempArray, tempArray.length + 1); // We adjust its size
                tempArray[tempArray.length - 1] = number; // We add the element that is not in the array already
            }
        }
        return tempArray;
    }
    
    public static void main (String[] args) {
        int[] inputArray = {6, 2, 1, 6, 7, 10, 11};
        System.out.println(Arrays.toString(inputArray));
        System.out.println(inputArray.length);
        // Does not matter if its sorted or not because the BinarySearch method sorts it
        int[] noRepeatsArray = fillWithOdds(inputArray);
        System.out.println(Arrays.toString(noRepeatsArray));
        System.out.println(noRepeatsArray.length);
    }
}
