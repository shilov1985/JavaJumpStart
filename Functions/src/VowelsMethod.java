import java.util.Scanner;

public class VowelsMethod {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes a sentence from the console and prints out the number of the vowel " +
                "letters in it.");
        String sentence = scan.nextLine();


        System.out.println("It sentence: " + sentence + " there is " + getNumberOfVowelLetters(sentence) + " vowel letters");
        scan.close();
    }

    private static int getNumberOfVowelLetters(String sentence) {
        char[] vowelLetters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int numberOfVowelLetters = 0;
        for (int i = 0; i < sentence.length(); i++) {

            for (char vowelLetter : vowelLetters) {
                if (sentence.charAt(i) == vowelLetter) {

                    numberOfVowelLetters++;
                }
            }
        }



        return numberOfVowelLetters;
    }
}
