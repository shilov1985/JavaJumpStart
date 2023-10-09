public class DecToHex {

    public static String[] names = { "0", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "A", "B", "C", "D", "E", "F" };

    public static void main(String[] args) {
        int[] nums = { 786, 354, 2467, 765, 40984, 97365, 630439, 255 ,720};

        for (int num : nums) {

            System.out.println(toHex(num));

        }

    }

    private static StringBuilder toHex(int num) {

        StringBuilder result = new StringBuilder();
        float d = num;
        int R;
        while (d >= 1) {

            d = d / 16;
            int c = (int) d;

            R = num - (c * 16);
            result.append(names[R]);
            num = num / 16;
        }

        return result.reverse();
    }

}
