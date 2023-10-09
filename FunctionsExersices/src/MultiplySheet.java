public class MultiplySheet {
    public static void main(String[] args) {
        printMultiplySheet(1);
    }

    private static void printMultiplySheet(int number) {
        int result;
        if (number > 10) {
            return;
        }

        for (int i = 0; i <= 10; i++) {
            result = number * i;
            System.out.println(number + "  X  " + i + "  =  " + result);
        }
        number++;
        printMultiplySheet(number);

    }
}
