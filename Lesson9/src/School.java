import java.util.Scanner;

public class School {

    public static void main(String[] args) {
        int assessment;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your assessment...");
        assessment = scan.nextInt();
        scan.close();
        char assessmentIndex = getAssessmentIndex(assessment);
        System.out.println("Your index is " + assessmentIndex);
    }

    private static char getAssessmentIndex(int assessment) {

        if (assessment < 25) {
            return 'F';
        } else if ((assessment >= 25) && (assessment <= 45)) {
            return 'E';
        } else if ((assessment > 45) && (assessment <= 50)) {
            return 'D';
        } else if ((assessment > 50) && (assessment <= 60)) {
            return 'C';
        } else if ((assessment > 60) && (assessment <= 80)) {
            return 'B';
        } else if (assessment > 80) {
            return 'A';
        }
        return 0;
    }
}
