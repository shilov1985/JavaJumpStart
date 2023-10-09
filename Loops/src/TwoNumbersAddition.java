import java.util.Scanner;

public class TwoNumbersAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes two whole numbers from the console and prints out the sum of them.");
        boolean isProgramAlive = true;
        do {
            System.out.println("PLease enter number one...");
            int numberOne = scan.nextInt();

            System.out.println("PLease enter number two...");
            int numberTwo = scan.nextInt();

            int sum = numberOne + numberTwo;
            System.out.println("The sum of the numbers = " + sum + "\n");
            System.out.println("Input \"yes\" to repeat the operation or press enter for end");
            scan.nextLine();
            String line = scan.nextLine();
            if (!line.equalsIgnoreCase("yes")) {
                isProgramAlive = false;
            }

        } while (isProgramAlive);
        scan.close();
    }


}

