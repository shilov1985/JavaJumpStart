import java.util.Scanner;

public class RealNumbers {

    private static float first;
    private static float second;

    /**
     */
    public static void main(String[] args) {


        System.out.println("**** Тази програма сравнява две реални числа/n " +
                "и пресмята дали са еднакви до 1-вия, 2-рия ,3-тия или 4-тия знак****");
        System.out.println("_______________________");

        readInputData();
        if ((int) (first * 10000f) == (int) (second * 10000f)) {

            System.out.println("Еднакви са да 4-тия знак");
        } else if ((int) (first * 1000f) == (int) (second * 1000f)) {

            System.out.println("Еднакви са да 3-тия знак");
        } else if ((int) (first * 100f) == (int) (second * 100f)) {

            System.out.println("Еднакви са да 2-тия знак");
        } else if ((int) (first * 10f) == (int) (second * 10f)) {

            System.out.println("Еднакви са да 1-тия знак");
        } else {
            System.out.println("Не са еднакви до 1-вия, 2-рия ,3-тия и 4-тия знак.");
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
