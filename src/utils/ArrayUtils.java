package utils;

/**
 * Created by skl1f on 4/16/2016.
 * Methods for working with Arrays.
 * Just for studying.
 */
public class ArrayUtils {
    public static String arrayToString(int[] arr) {
        String str = "";
        for (int i : arr) {
            str = str + i + " ";
        }
        return str;
    }

    public static int[] genArray(int size) {
        int[] resultArr = new int[size];
        for (int i = 0; i < size; i++) {
            resultArr[i] = i;
        }
        return resultArr;
    }

    public static int[] genArray(int size, int min, int max) {
        int[] resultArr = new int[size];
        for (int i = 0; i < size; i++) {
            resultArr[i] = (int) (min + Math.random() * (max - min));
        }
        return resultArr;
    }

    public static int[] createOddEvenArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (min + Math.random() * (max - min));
            if (i % 2 == 0) {
                //even
                array[i] = random % 2 == 0 ? random : ++random;
            } else {
                //odd
                array[i] = random % 2 == 0 ? ++random : random;
            }
        }
        return array;
    }
}
