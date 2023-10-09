import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {9, 5, 4, 5, 5, 5, 7, 8, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] arr1 = remove(4, arr);
        System.out.println(Arrays.toString(arr1));

        int[] arrIns = insertAtPosition(arr1, 8, 100);
        System.out.println(Arrays.toString(arrIns));

        int[] arr2 = removeAll(5, arrIns);
        System.out.println(Arrays.toString(arr2));

        int max = getSecondMaxValue(arr);
        System.out.println(max);


        int min = getSecondMinValue(arr);
        System.out.println(min);
    }

    private static int getSecondMinValue(int[] arr2) {
        int min = arr2[0];
        int counter = 2;
        for (int j : arr2) {
            if (j < min && counter != 0) {
                min = j;
                counter--;
            }
        }
        return min;
    }

    private static int getSecondMaxValue(int[] arr2) {

        int max = arr2[0];
        int counter = 2;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max && counter != 0) {
                max = arr2[i];
                counter--;
            }
        }
        return max;
    }

    private static int[] insertAtPosition(int[] arr, int position, int value) {

        if (position > arr.length || position < 0) {
            return arr;
        } else {
            int c = 0;
            int[] arr1 = new int[arr.length + 1];
            for (int i = 0; i < arr1.length; i++) {
                if (i == position) {
                    arr1[i] = value;
                } else {
                    arr1[i] = arr[c];
                    c++;
                }
            }

            return arr1;
        }

    }

    private static int[] remove(int value, int[] arr) {

        boolean isFound = false;
        for (int j : arr) {
            if (j == value) {
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            return arr;
        } else {
            int[] arr1 = new int[arr.length - 1];
            int c = 0;
            for (int element : arr) {
                if (element == value && isFound) {
                    isFound = false;
                } else {
                    arr1[c] = element;
                    c++;
                }
            }
            return arr1;
        }

    }

    private static int[] removeAll(int value, int[] arr) {

        int comparision = 0;
        for (int j : arr) {
            if (j == value) {
                comparision++;
            }
        }
        if (comparision == 0) {
            return arr;
        } else {
            int[] arr1 = new int[arr.length - comparision];
            int c = 0;
            for (int j : arr) {
                if (!(j == value)) {
                    arr1[c] = j;
                    c++;
                }
            }
            return arr1;
        }

    }

}
