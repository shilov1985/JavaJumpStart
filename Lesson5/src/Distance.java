public class Distance {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 34;
        int y = 45;

        System.out.println(calculateDistance(x, y));

    }

    private static float calculateDistance(int x, int y) {

        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    }

}
