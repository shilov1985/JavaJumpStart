import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        System.out.println("This program prints two matrix");
        Scanner scan = new Scanner(System.in);


        int[][] matrix1 = initMatrix(scan);

        int[][] matrix2 = initMatrix(scan);

        // int[][] a = {{1, 2, 3, 9}, {4, 5, 6, 9}, {7, 8, 9, 9}, {4, 4, 4, 9}};
        // int[][] b = {{7, 7, 7, 9}, {8, 8, 8, 8}, {6, 6, 6, 7}, {8, 8, 8, 7}};


        System.out.println("Direct sum is>>>>>>");
        if (printDirectSum(matrix1, matrix2) == -1) {
            System.out.println("Invalid matrix size!");
        }

        System.out.println("Element sum is>>>>>>");
        if (printElementSum(matrix1, matrix2) == -1) {
            System.out.println("Invalid matrix size!");
        }
        scan.close();
    }

    private static int printElementSum(int[][] a, int[][] b) {
        if (a.length == b.length && a[0].length == b[0].length && a.length != 0) {
            for (int row = 0; row < a[0].length; row++) {
                for (int col = 0; col < a[0].length; col++) {
                    System.out.print(a[row][col] + b[row][col] + " ");
                }
                System.out.println();
            }
            return 1;
        } else {
            return -1;
        }
    }


    private static int printDirectSum(int[][] a, int[][] b) {

        if ((a.length != 0) && (b.length != 0)) {

            for (int[] ints : a) {

                for (int col = 0; col < a[0].length; col++) {
                    System.out.print(ints[col] + " ");
                }
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print("0 ");
                }
                System.out.println();
            }

            for (int[] ints : b) {

                for (int col = 0; col < a[0].length; col++) {
                    System.out.print("0 ");
                }
                for (int col = 0; col < b[0].length; col++) {
                    System.out.print(ints[col] + " ");
                }
                System.out.println();
            }

            return 1;
        }
        return -1;
    }


    private static int[][] initMatrix(Scanner scan) {
        System.out.println("Please input the rows number of the  matrix...");
        int firstMatrixRows = scan.nextInt();
        System.out.println("Please input the columns number of the matrix...");
        int firstMatrixCols = scan.nextInt();
        int[][] matrix1 = new int[firstMatrixRows][firstMatrixCols];
        int rowCount = 0;

        while (rowCount < firstMatrixRows) {
            int colCount = 0;
            while (colCount < firstMatrixCols) {
                System.out.println("Please input value for " + rowCount + " row " + colCount + " column...");
                matrix1[rowCount][colCount] = scan.nextInt();
                colCount++;
            }
            rowCount++;

        }
        return matrix1;
    }
}
