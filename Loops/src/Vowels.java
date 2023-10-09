import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        char[] vowelLetters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes a sentence from the console and prints out the number of the vowel " +
                "letters in it.");
        String sentence = scan.nextLine();


        int numberOfVowelLetters = 0;
        for (int i = 0; i < sentence.length(); i++) {

            for (int j = 0; j < vowelLetters.length; j++) {
                if (sentence.charAt(i) == vowelLetters[j]) {

                    numberOfVowelLetters++;
                }
            }
        }
        System.out.println("It sentence: " + sentence + " there is " + numberOfVowelLetters + " vowel letters");
        scan.close();
    }
}
