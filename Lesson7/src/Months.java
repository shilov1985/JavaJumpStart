import java.util.Scanner;

public class Months {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Please enter some day in range 1 - 12 inc.");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch(day){

            case 1:System.out.println("януари");break;
            case 2:System.out.println("февруари");break;
            case 3:System.out.println("март");break;
            case 4:System.out.println("април");break;
            case 5:System.out.println("май");break;
            case 6:System.out.println("юни");break;
            case 7:System.out.println("юли");break;
            case 8:System.out.println("август");break;
            case 9:System.out.println("септември");break;
            case 10:System.out.println("октомври");break;
            case 11:System.out.println("ноември");break;
            case 12:System.out.println("декември");break;
            default :System.out.println("Invalid");break;
        }





    }

}
