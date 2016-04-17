package week2.day1;

import utils.ArrayUtils;
import java.util.Arrays;

/**
 * Created by skl1f on 4/16/2016.
 * Play with arrays and methods.
 */
public class _05Methods {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        String result = ArrayUtils.arrayToString(arrays);
        String result1 = Arrays.toString(arrays);
        System.out.println(result);
        System.out.println(result1);

        int[] arr = ArrayUtils.genArray(10);
        int[] arr1 = ArrayUtils.genArray(10, 0, 2147483647);

        System.out.println(ArrayUtils.arrayToString(arr));
        System.out.println(ArrayUtils.arrayToString(arr1));
    }
}
