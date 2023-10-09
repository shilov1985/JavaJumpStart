import java.util.Arrays;

public class MiddleSymbol {
    public static void main(String[] args) {

        String sentence = "marriedo";

        char[] middleSymbols = getMiddleSymbols(sentence);
        System.out.println(Arrays.toString(middleSymbols));

    }

    private static char[] getMiddleSymbols(String sentence) {
        char[] sym = new char[1];

        if (sentence.length() % 2 == 1) {
            sym[0] = sentence.charAt(sentence.length() / 2);
        } else {
            sym = new char[2];
            sym[1] = sentence.charAt(sentence.length() / 2);
            sym[0] = sentence.charAt((sentence.length() / 2) - 1);

        }
        return sym;
    }
}
