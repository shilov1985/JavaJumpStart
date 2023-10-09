import java.util.Scanner;

public class Dice {
    private static final int PLAYER_TRIES = 2;
    static String[] names;
    static int[] results;

    public static void main(String[] args) {

        System.out.println("""
                ���� � �������� �����.
                ����� ����� ��� ������� �� ������ ��� ���� ,���� ���� � �� ��� ������� �����.
                ����� �������� ���� �� ��������, ���� ���� ����� �� ����� �����.
                ������ ������ � ���-����� ��������.����� :)
                ���� �������� ���� �� ��������...""");
        Scanner scan = new Scanner(System.in);
        int playersNumber = scan.nextInt();
        names = new String[playersNumber];
        results = new int[playersNumber];
        scan.nextLine();
        int counter = 0;
        while (counter < playersNumber) {
            System.out.println("���� �������� ��� �� �����");
            names[counter] = scan.nextLine();
            counter++;
        }


        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < PLAYER_TRIES; j++) {

                System.out.println("�� ��� � " + names[i] + ". �� �� ������� ������ ������� Enter");
                String line = scan.nextLine();
                while (line.length() != 0) {
                    System.out.println("�� ��� � " + names[i] + ". �� �� ������� ������ ������� Enter");
                    line = scan.nextLine();

                }
                int result = roll();
                results[i] = results[i] + result;


            }
        }
        printResult();

        int flag = getWinner();
        if (flag == 0) {
            System.out.println("Draw!");
        } else {
            System.out.println(" Winner is " + names[flag]);
        }
        scan.close();
    }

    private static int getWinner() {
        int winner = results[0];
        int winnerIndex = 0;
        for (int i = 1; i < results.length; i++) {

            if (winner < results[i]) {
                winner = results[i];
                winnerIndex = i;

            }
        }
        if (isDrow(winner)) {
            return 0;
        }
        return winnerIndex;
    }

    private static boolean isDrow(int winner) {
        int flag = 0;
        for (int result : results) {
            if (winner == result) {
                flag++;
            }
        }
        return flag > 1;
    }

    private static void printResult() {
        System.out.println("���������:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + results[i] + " �����.");
        }
    }


    static int roll() {
        return (int) (6.0 * Math.random()) + 1;
    }
}
