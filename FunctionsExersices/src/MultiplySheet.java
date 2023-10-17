public class MultiplySheet {
    public static void main(String[] args) {
        printMultiplySheet(1, 0);
    }

    private static void printMultiplySheet(int number1, int number2) {
        if (number2 > 10) {
            number2 = 0;
            number1++;
        }
        if (number1 > 10) {
            return;
        }

        int result = number1 * number2;
        System.out.println(number1 + "  X  " + number2 + "  =  " + result);

        number2++;
        printMultiplySheet(number1, number2);

    }
}
