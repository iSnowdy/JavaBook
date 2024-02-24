package Unit2;

import java.util.Scanner;

public class PlusDaySwitch {
    public static void main (String[] args) {
    
        System.out.println("Input a day, month and year (in that order)"
                + "and I will tell you the following day date");
        
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        int dayOfTheMonth = switch(month) {
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                yield 31;
            }
        };
        
        day ++;
        
        if (day > dayOfTheMonth) {
            month ++;
            day = 1;
            if (month > 12) {
                year ++;
                month = 1;
            }
        }
        
        System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
    }
}