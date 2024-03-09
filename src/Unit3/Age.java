package Unit3;
import java.util.*;

public class Age {
    public static String calculateAge () {
        String result = "";
        Scanner sc = new Scanner(System.in);
        
        boolean exit = true;
        int[] ages = new int [200];
        String text = "";
        int index = 0;
        
        do {
            System.out.println("Type in your age: ");
            int age = sc.nextInt();
            ages[index] = age;
            index ++;
            System.out.println("If you would like to insert another age, type yes");
            sc.nextLine();
            text = sc.nextLine();
            exit = text.equalsIgnoreCase("yes") ? exit = true : false;
        }
        while (exit);
        
        System.out.println("Now that you have finished introducing all the data, I will show you"
                + "the youngest and oldest person");
        
        int sizeControl = 0;
        for (int number : ages) {
            if (number != 0) {
                sizeControl ++;
            } else break;
        }
        
        ages = Arrays.copyOf(ages, sizeControl);
        
        for (int i = 0; i < ages.length - 1; i ++) {
            for (int j = 0; j < ages.length - i - 1; j ++){
                if (ages[j] > ages[j + 1]) {
                    int temp = ages[j];
                    ages[j] = ages[j + 1];
                    ages[j + 1] = temp;
                }
            }
        }
        
        result = "The youngest person is " + ages[0] + " years old and the oldest " + ages[ages.length - 1] + " years old";
        System.out.println(result);
        return result;
    }
    
    public static void main (String[] args) {
        calculateAge();
    }
}
