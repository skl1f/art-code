package utils;

/**
 * Created by skl1f on 4/16/2016.
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
            resultArr[i] = (int) (Math.random() * 2147483647);
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
}
