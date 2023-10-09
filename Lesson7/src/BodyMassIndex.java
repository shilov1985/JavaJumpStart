import java.util.Scanner;

public class BodyMassIndex {

    private static float weight;
    private static float height;

    /**
     * @param args
     */
    public static void main(String[] args) {
        while (weight == 0 || height == 0) {

            readInputData();

        }
        float BMI = getBMI(weight, height);
        System.out.println("Your BMI is " + BMI);
        rateBMI(BMI);
    }

    private static void rateBMI(float bmi) {
        if (bmi < 18.5) {
            System.out.println("Overweight!");
        } else if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println("Normal :)");
        } else if (bmi > 24.9) {
            System.out.println("Underweight!");
        }
    }

    private static void readInputData() {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter your weight in kilos!");
            weight = input.nextFloat();
            System.out.println("Please enter your height in meters!");
            height = input.nextFloat();
            input.close();

        } catch (Exception e) {
            System.out.println("invalid data! Please enter data in format of 0,00");
        }

    }

    private static float getBMI(float weight, float height) {

        return (float) ((weight / (Math.pow(height, 2))));
    }
}
