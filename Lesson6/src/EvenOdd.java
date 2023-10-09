import java.util.Scanner;

public class EvenOdd {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.printf(input % 2 == 0 ? "Even" : "Odd");
        scan.close();

    }

}
