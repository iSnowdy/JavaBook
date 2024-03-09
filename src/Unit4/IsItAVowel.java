package Unit4;
import java.util.Scanner;

public class IsItAVowel {
    public static boolean vowelOrNot (char character) {
        String text = "aeiouáéíóúäëïöüàèìòù";
        character = Character.toLowerCase(character);
       
        if (text.contains(Character.toString(character))) return true;
        
        return false;
    }
    
    public static void main (String[] args) {
        System.out.println("Letter A is a vowel? " + vowelOrNot('A'));
        System.out.println("Letter í is a vowel? " + vowelOrNot('í'));
        System.out.println("Letter f is a vowel? " + vowelOrNot('f'));
    }
}
