import java.util.Scanner;

public class BodyMassIndex {

    private static float weight;
    private static float height;

    public static void main(String[] args) {

        while (weight == 0 || height == 0) {

            getData();

        }

        // System.out.println(weight);
        // System.out.println(height);

        System.out.println("Your BMI is " + getBMI(weight, height));

    }

    private static void getData() {

        Scanner input = new Scanner(System.in);
        try {
            System.out
                    .println("_______________________BMI_____________________");
            System.out
                    .println("| This program calculate your body mass index.|");
            System.out
                    .println("| Please enter your data in format of \"x,xx\"  |");
            System.out
                    .println("|_____________________________________________|\n");
            weight = getWeight(input);
            height = getHeight(input);
            input.close();

        } catch (Exception e) {
            System.out.println("invalid data");
        }

    }

    private static float getWeight(Scanner input) {
        System.out.println("Input weight in kilos");
        float w = 0f;
        w = input.nextFloat();
        return w;

    }

    private static float getHeight(Scanner input) {
        System.out.println("Input height in meters");
        float h = input.nextFloat();
        return h;

    }

    private static float getBMI(float weight, float height) {

        return (float) ((weight / (Math.pow(height, 2))));
    }

}
