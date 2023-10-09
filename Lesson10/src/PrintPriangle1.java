public class PrintPriangle1 {
    public static void main(String[] args) {
        int size = 5;
        for (int col = size; col >= 0; --col) {

            for (int row = 1; row <= col; row++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
