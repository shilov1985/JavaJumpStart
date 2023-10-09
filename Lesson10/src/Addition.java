import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("This program sum up positive numbers in range 0-100 inc.\n" +
                " Please input positive number in range 0-100 inc");
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {


            String line = scan.nextLine();
            if (line.length() > 0) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    int num = Integer.parseInt(line);
                    if (num < 0) {
                        continue;
                    } else if (num <= 100) {
                        number += num;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data!Please input positive number in range 0-100 inc ");
                }


                System.out.println("Sum = " + number);
            }
        }
    }

}
