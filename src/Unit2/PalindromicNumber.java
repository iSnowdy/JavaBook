package Unit2;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int numberInput = 0;
        boolean palindromicNumber = true;
        
        System.out.println("Tell me a number and I will tell you if it is a"
                + "palindromic number or not");
        
        System.out.println("Warning: The number must be >= 10");
        
        do {
            numberInput = sc.nextInt();
        
            if (isPalindrome(numberInput)) {
                System.out.println("Yes. Your number " + numberInput + " is a palindromic"
                        + " number");
            } else { 
                System.out.println("No. Your number " + numberInput +
                    " is not a palindromic number");
                System.out.println("The palindromic number of yours is "
                        + isPalindrome(numberInput));
            }
        }
        while (numberInput < 10); // Error control version better than with while
        int numberInputPalindromic = numberInput;
        
    }
    
    public static int isPalindrome(int number) {
        
        int inputNumber = number;
        int reverse = 0;
        
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
            /*
            
            El módulo de 10 sobre un número da la última cifra.
            El módulo de 100 las 2 últimas, y así consecutivamente.
            
            Un número capicúa o número palíndromo es aquel que se lee igual al revés
            
            El número al ir añadiéndole unidades (10) y sumándole la última cifra 
            lo iremos revirtiendo
            
            Si se quiere hacer palindromo habría que ir sumándole el número inverso
            hasta que lo sea
            
            */
        }
        return inputNumber == reverse ? inputNumber : reverse;
    }
}
