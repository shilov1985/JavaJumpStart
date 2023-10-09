import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("This program check for that is some word palidrome." +
                "\nPlease enter some word...");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(isPalindrome(word) ? "Palindrome" : "Not Palindrome");

    }

    private static boolean isPalindrome(String word) {

        if (word.length() < 1) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }

        for (int start = 0, end = word.length() - 1; start < word.length() / 2; start++, end--) {
            if (!(word.charAt(start) == word.charAt(end))) {
                return false;
            }
        }

        return true;
    }
}
