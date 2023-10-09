import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes one whole number from the" +
                " console and prints out it to the console in reverse.\nPlease input a whole number...");
        int number = scan.nextInt();
        scan.close();

        int divider = 10;
        int tmp = number;
        System.out.println("Your result is: ");
        while (tmp > 0) {

            System.out.print(tmp - (tmp / 10 * 10));

            tmp = number / divider;
            divider = divider * 10;

        }


    }
}
