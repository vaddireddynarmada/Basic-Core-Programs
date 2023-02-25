import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        vowelOrConsonant('a');
    }

    public static void vowelOrConsonant(char alphabet) {
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
            System.out.println("Alphabet is Vowel");
        else
            System.out.println("Alphabet is consonant");
    }
}


