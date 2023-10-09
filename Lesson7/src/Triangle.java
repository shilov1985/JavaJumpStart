import java.util.Scanner;

public class Triangle {

    private static float x;
    private static float y;
    private static float z;

    public static void main(String[] args) {

        while (x == 0 || y == 0 || z == 0) {
            readInputData();
        }
        if (x == y && y == z && z == x) {
            System.out.println("Равностранен");
        } else if (x == y || y == z || z == x) {
            System.out.println("Равнобедрен");
        }
        if (x != y && y != z && z != x) {
            System.out.println("Разностранен");
        }

    }

    private static void readInputData() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter length of X");
            x = input.nextFloat();
            System.out.println("Now enter length of Y");
            y = input.nextFloat();
            System.out.println("And finally of Z");
            z = input.nextFloat();
            input.close();

        } catch (Exception e) {
            System.out.println("invalid data");
        }

    }
}
