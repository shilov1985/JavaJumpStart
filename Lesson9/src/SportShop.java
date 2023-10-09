import java.util.Objects;
import java.util.Scanner;

public class SportShop {
    public static void main(String[] args) {


        System.out.println("""
                ���������.�� ��� ������� �������.
                ���� ��������� ������� �� ����� � �� �������� �������� ��:
                20% �� ������ �����- ��������� �
                10% �� ������ ������� ������- ��������� �
                5% �� ������ ����� �����- ��������� �
                 ���� �������� �������� ��������� �� �� �������� ������� �� ��� � ��������� ENTER""");
        Scanner scan = new Scanner(System.in);

        String product = getStringFromConsole(scan);
        switch (Objects.requireNonNull(product)) {
            case "�" -> System.out.println("��������� ��������� � -�����!");
            case "�" -> System.out.println("��������� ��������� � -������� ������!");
            case "�" -> System.out.println("��������� ��������� � -����� �����!");
        }


        System.out.println("���� �������� ���� �� ��������!");

        float price = getIntFromConsole(scan);


        scan.close();

        switch (product) {
            case "�" -> {
                System.out.println("��������� ��������� � -����� �� ���� �� " + price + "��.");
                float discountA = price - ((20f / 100f) * price);
                System.out.println("������ ���� ���������� � " + discountA);
            }
            case "�" -> {
                System.out.println("��������� ��������� � -������� ������ �� ���� �� " + price + "��.");
                float discountB = price - ((10f / 100f) * price);
                System.out.println("������ ���� ���������� � " + discountB);
            }
            case "�" -> {
                System.out.println("��������� ��������� � -����� �� ���� �� " + price + "��.");
                float discountC = price - ((5f / 100f) * price);
                System.out.println("������ ���� ���������� � " + discountC);
            }
        }

    }

    private static float getIntFromConsole(Scanner scan) {
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.matches("\\d+\\.\\d+|\\d+")) {
                return Float.parseFloat(line);
            } else {
                System.out.println("��������� ����!���� �������� ����...");
            }
        }
        return 0.0f;

    }

    private static String getStringFromConsole(Scanner scan) {

        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.matches("[�-�]")) {
                return line;
            } else {
                System.out.println("��������� ���������!���� �������� ���������...");
            }
        }
        return null;

    }


}
