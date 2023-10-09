import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("This program process the factorial(!) of a number.\n" +
                "Please input whole positive number or input EXIT for close...");
        Scanner scan = new Scanner(System.in);


        while (scan.hasNext()) {

            String line = scan.nextLine();
            if (line.length() > 0) {

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    int input = Integer.parseInt(line);
                    double number = input;
                    if (input == 0) {
                        System.out.println(input + "! = 1");
                        System.out.println("Please input a whole number great or equal to zero or input EXIT for close...");
                    } else {
                        if (input > 0) {
                            for (int i = input - 1; i > 0; i--) {
                                number = number * i;
                            }
                            System.out.println(input + "! = " + number);
                        }
                        System.out.println("Please input a whole number great or equal to zero or input EXIT for close...");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please input a whole number great or equal to zero or input EXIT for close...");
                }


            }
        }

    }

}

