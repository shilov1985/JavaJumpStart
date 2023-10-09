import java.util.Scanner;

public class PrintPriangle2 {
    public static void main(String[] args) {


        System.out.println("This program prints triangle to the console.\nPlease input some whole number...");
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        scan.close();

        for (int colStart = 0, colEnd = size; colStart < size; colStart++, colEnd--) {


            for (int i = 0; i < colStart; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < colEnd; i++) {
                System.out.print(" #");
            }
            System.out.println();


        }
    }
}
