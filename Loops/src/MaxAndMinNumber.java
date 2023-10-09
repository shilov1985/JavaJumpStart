import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes numbers from the console and prints out the greater and the lesser number.");
        boolean isProgramAlive = true;
        do {
            System.out.println("PLease enter whole number");
            int input = scan.nextInt();
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
            System.out.println("The greater number is " + max + " , the lesser number is " + min);
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

