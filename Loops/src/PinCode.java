import java.util.Scanner;

public class PinCode {
    public static final int PIN_CODE = 1234;
    public static final int TRIES = 3;

    public static void main(String[] args) {

        System.out.println("This program takes whole number from the console(pin code) and " +
                "try to get in an account using it.");
        Scanner scan = new Scanner(System.in);


        boolean readForPinCode = true;
        int tries = 0;
        while (readForPinCode) {

            System.out.println("Please input pin code...");
            int n = scan.nextInt();
            tries++;
            if (n == PIN_CODE) {
                System.out.println("Welcome again :)");
                readForPinCode = false;
            } else {
                if (tries == TRIES) {
                    System.out.println("Your account is locked!");
                    readForPinCode = false;
                } else {
                    System.out.println("Wrong pin code.You have " + (TRIES - tries) + " possible tries:( Try again...");

                }
            }

        }
        scan.close();
    }
}
