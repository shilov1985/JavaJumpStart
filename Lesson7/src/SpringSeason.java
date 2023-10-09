import java.util.Scanner;

public class SpringSeason {

    private static int month;
    private static int day;

    public static void main(String[] args) {

        while (month == 0 || day == 0) {

            readInputData();

        }
        if ((month == 3 && day >= 20) || (month > 3 && month < 6)
                || (month == 6 && day <= 20)) {
            System.out.println("Summer");
        } else {
            System.out.println("Not summer");
        }
    }

    private static void readInputData() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter month");
            month = input.nextInt();
            System.out.println("Please enter day");
            day = input.nextInt();
            input.close();

        } catch (Exception e) {
            System.out.println("invalid data");
        }

    }
}
