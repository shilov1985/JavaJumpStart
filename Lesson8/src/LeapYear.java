import java.util.Scanner;

public class LeapYear {

    private static int year;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        scan.close();

        if (year % 100 == 0) {

            if (year % 400 == 0)
                System.out.println("���� � ��������� ������.");
        } else if (year % 4 == 0) {
            System.out.println("���� � ��������� ������.");
        } else {
            System.out.println("���� �� � ��������� ������.");
        }

    }

}
