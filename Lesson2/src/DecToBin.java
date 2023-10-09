public class DecToBin {
    public static void main(String[] args) {

        int[] nums = { 786, 354, 2467, 765, 40984, 97365, 630439, 255 };

        for (int num : nums) {

            System.out.println(toBin(num));

        }

    }

    private static StringBuilder toBin(int num) {
        StringBuilder bin = new StringBuilder();

        while (num >= 1) {

            if (num % 2 == 0) {
                bin.append("0");
            } else {
                bin.append("1");
            }
            num = num / 2;
        }

        return bin.reverse();
    }

}
