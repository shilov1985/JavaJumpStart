import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                This program calculate the area of triangle, rectangle or circle.
                Please input:
                "1" for triangle\s
                "2" for rectangle\s
                "3" for circle\s
                or input any other number for end program.""");

        int oblectFlag = scan.nextInt();
        if (oblectFlag == 1) {
            System.out.println("Please input the length of the triangle...");
            double l = scan.nextDouble();
            System.out.println("Please input the height of the triangle...");
            double h = scan.nextDouble();
            System.out.println("The area is " + getTriangleArea(l, h));
        } else if (oblectFlag == 2) {
            System.out.println("Please input the height of the rectangle...");
            double l = scan.nextDouble();
            System.out.println("Please input the weight of the rectangle...");
            double h = scan.nextDouble();
            System.out.println("The area is " + getRectangleArea(l, h));
        } else if (oblectFlag == 3) {
            System.out.println("Please input the radius of the circle...");
            double r = scan.nextDouble();
            System.out.println("The area is " + getCircleArea(r));
        }


        scan.close();


    }

    private static double getCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    private static double getRectangleArea(double l, double h) {
        return l * h;
    }

    private static double getTriangleArea(double l, double h) {
        return (l * h) / 2;
    }
}
