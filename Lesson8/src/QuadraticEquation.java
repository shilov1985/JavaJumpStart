import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        float a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        scan.close();
        //Еxample for discriminant zero is usage of vars> a = 1, b = -4, c = 4
        double D = Math.pow(b, 2) - (4 * (a * c));
        System.out.println(D);

        if (D < 0) {
            System.out.println("няма реални корени");
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Х = " + x);
        } else if (D > 0) {
            double root1;
            double root2;

            double underRootEx = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

            root1 = (-(b) - underRootEx) / 2 * a;
            root2 = (-(b) + underRootEx) / 2 * a;

            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);
        }
    }
}