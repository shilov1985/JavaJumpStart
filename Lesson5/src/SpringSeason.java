public class SpringSeason {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int month = 3;
        int day = 20;
        System.out
                .println((month == 3 && day >= 20) || (month > 3 && month < 6)
                        || (month == 6 && day <= 20) ? "Yes" : "false");
    }

}
