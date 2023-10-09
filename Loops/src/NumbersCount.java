import java.util.Scanner;

public class NumbersCount {
    public static void main(String[] args) {
        int negativeNumCounter = 0, positiveNumCounter = 0, zeroNumCounter = 0;
        System.out.println("""
                This program takes numbers from the console and prints out the number of all\040
                negative, positive and zero numbers.""");
        Scanner scan = new Scanner(System.in);
        boolean isProgramAlive = true;

        do {
            System.out.println("Please input some number...");
            int input = scan.nextInt();
            if (input == 0) {
                zeroNumCounter++;
            } else if (input > 0) {
                positiveNumCounter++;
            } else {
                negativeNumCounter++;
            }
            System.out.println("You input: "+zeroNumCounter+" zeros, "+positiveNumCounter+" positive nimbers" +
                    " and "+negativeNumCounter+" negative numbers.");
            System.out.println("Input \"yes\" to proceed the operation or press enter for end");
            scan.nextLine();
            String line = scan.nextLine();
            if (!line.equalsIgnoreCase("yes")) {
                isProgramAlive = false;
            }


        } while (isProgramAlive);


    }
}
