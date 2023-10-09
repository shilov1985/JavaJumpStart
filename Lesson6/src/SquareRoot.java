import java.util.Scanner;

public class SquareRoot {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.printf("%.5f", Math.sqrt(input));
        scan.close();
    }

}
