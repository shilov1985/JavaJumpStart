import java.util.Scanner;

public class ObjectForm {
    public static void main(String[] args) {
        double height, width;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input width:");
        width = scan.nextDouble();
        System.out.println("Please input height:");
        height = scan.nextDouble();

        if (height != 0 && width != 0) {
            System.out.println("The object is" + determineObjectType(width, height));
        } else {
            System.out.println("Invalid data");
        }
    }

    private static String determineObjectType(double width, double height) {


        if (width == height) {

            return "Square";
        } else {

            return "Rectangle";
        }

    }
}
