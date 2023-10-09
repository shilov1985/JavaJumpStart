import java.util.Scanner;

public class NewShoes {
    public static final int MAX_PRICE = 150, SIZE_1 = 44, SIZE_2 = 45;
    public static String COLOR = "BLACK";
    public static boolean IS_RETURNALBE = true;

    public static void main(String[] args) {

        int price = 0;
        int size = 0;
        String color = null;
        boolean isReturnable = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter shoes price:");
        price = scan.nextInt();
        System.out.println("Enter shoes size:");
        size = scan.nextInt();
        System.out.println("Enter shoes color:");
        scan.nextLine();
        color = scan.nextLine();
        System.out
                .println("Is the shoes returnable? Input \"true\" for YES/\"false\" for NO:");

        String line = scan.nextLine();
        if (line.equalsIgnoreCase("yes")) {
            isReturnable = true;
        } else if (line.equalsIgnoreCase("no")) {
            isReturnable = false;
        }
        int c = 0;
        if (price > MAX_PRICE) {
            c++;
            System.out.println("The price is too hight!");
        }
        if ((size != SIZE_1) && (size != SIZE_2)) {
            c++;
            System.out.println("This is not my size!");
        }
        if (!color.equalsIgnoreCase(COLOR)) {
            c++;
            System.out.println("This is not my color!");
        }
        if (isReturnable != IS_RETURNALBE) {
            c++;
            System.out.println("It is not returnable product!");
        }
        if (c == 0) {
            System.out.println("I will buy this shoes :)");
        } else {
            System.out.println("I will NOT buy this shoes :)");
        }

    }
}
