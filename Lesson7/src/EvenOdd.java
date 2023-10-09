import java.util.Scanner;

public class EvenOdd {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("Enter some number...");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input % 2 == 0){
            System.out.printf("Even");
        }else{
            System.out.printf("Odd");
        }

        scan.close();

    }

}
