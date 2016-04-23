package week3.day1;

import utils.ArrayUtils;
import java.util.Arrays;

/**
 * Created by skl1f on 4/23/2016.
 */
public class _00CreateOddEvenArray {
    public static void main(String[] args) {
        int[] test = ArrayUtils.createOddEvenArray(10, 25, 75);
        System.out.println(Arrays.toString(test));
    }
}
