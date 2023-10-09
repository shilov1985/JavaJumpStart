import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        System.out.println("This program check for that some letter is vowel of consonant.\nPlease " +
                "input a letter in range of A-Z or a-z");
        char letter = getLetterFromInput();

        System.out.println("letter " + letter + " is " + determineVowelAgreedLetter(letter));

    }

    private static String determineVowelAgreedLetter(char letter) {

        char[] vowelLetters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char c : vowelLetters) {
            if (c == letter) {
                return "Vowel";
            }
        }
        return "Consonant";

    }

    private static char getLetterFromInput() {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            String line = scan.nextLine();

            if (line.length() > 0) {

                String firstLetter = String.valueOf(line.charAt(0));
                if (firstLetter.matches("[A-Za-z]")) {
                    return line.charAt(0);
                } else {
                    System.out.println("Please " +
                            "input a letter in range of A-Z or a-z");
                }
            }
        }
        return 0;
    }
}
