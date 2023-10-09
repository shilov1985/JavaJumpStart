import java.util.Scanner;

public class RealNumbers {

    private static float first;
    private static float second;

    /**
     */
    public static void main(String[] args) {


        System.out.println("**** ���� �������� �������� ��� ������ �����/n " +
                "� �������� ���� �� ������� �� 1-���, 2-��� ,3-��� ��� 4-��� ����****");
        System.out.println("_______________________");

        readInputData();
        if ((int) (first * 10000f) == (int) (second * 10000f)) {

            System.out.println("������� �� �� 4-��� ����");
        } else if ((int) (first * 1000f) == (int) (second * 1000f)) {

            System.out.println("������� �� �� 3-��� ����");
        } else if ((int) (first * 100f) == (int) (second * 100f)) {

            System.out.println("������� �� �� 2-��� ����");
        } else if ((int) (first * 10f) == (int) (second * 10f)) {

            System.out.println("������� �� �� 1-��� ����");
        } else {
            System.out.println("�� �� ������� �� 1-���, 2-��� ,3-��� � 4-��� ����.");
        }

    }

    private static void readInputData() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter first number:");
            first = input.nextFloat();
            System.out.println("Please enter second number:");
            second = input.nextFloat();
            input.close();

        } catch (Exception e) {
            System.out.println("invalid data! Please enter the numbers in format of 0,00");
        }

    }
}
