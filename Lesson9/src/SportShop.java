import java.util.Objects;
import java.util.Scanner;

public class SportShop {
    public static void main(String[] args) {


        System.out.println("""
                Здравейте.Аз съм спортен магазин.
                Моля направете покупка на стока и ще получите отстъпка от:
                20% за всички дрехи- категория А
                10% за всички спортни обувки- категория Б
                5% за всички други стоки- категория В
                 Моля въведете желаната категория за да поръчате продукт от нея и натиснете ENTER""");
        Scanner scan = new Scanner(System.in);

        String product = getStringFromConsole(scan);
        switch (Objects.requireNonNull(product)) {
            case "А" -> System.out.println("Въведохте категория А -дрехи!");
            case "Б" -> System.out.println("Въведохте категория Б -спортни обувки!");
            case "В" -> System.out.println("Въведохте категория В -други стоки!");
        }


        System.out.println("Моля въведете цена на продукта!");

        float price = getIntFromConsole(scan);


        scan.close();

        switch (product) {
            case "А" -> {
                System.out.println("Въведохте категория А -дрехи на цена от " + price + "лв.");
                float discountA = price - ((20f / 100f) * price);
                System.out.println("Цената след отстъпката е " + discountA);
            }
            case "Б" -> {
                System.out.println("Въведохте категория Б -спортни обувки на цена от " + price + "лв.");
                float discountB = price - ((10f / 100f) * price);
                System.out.println("Цената след отстъпката е " + discountB);
            }
            case "В" -> {
                System.out.println("Въведохте категория В -други на цена от " + price + "лв.");
                float discountC = price - ((5f / 100f) * price);
                System.out.println("Цената след отстъпката е " + discountC);
            }
        }

    }

    private static float getIntFromConsole(Scanner scan) {
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.matches("\\d+\\.\\d+|\\d+")) {
                return Float.parseFloat(line);
            } else {
                System.out.println("Невалидна сума!Моля въведете сума...");
            }
        }
        return 0.0f;

    }

    private static String getStringFromConsole(Scanner scan) {

        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.matches("[А-В]")) {
                return line;
            } else {
                System.out.println("Невалидна категория!Моля въведете категория...");
            }
        }
        return null;

    }


}
