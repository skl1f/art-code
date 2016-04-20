package week2.home;

import utils.ArrayUtils;

import java.util.stream.IntStream;

/**
 * Created by skl1f on 4/18/2016.
 * Program will find average sum of integer array
 */

public class _32AverageSum {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.genArray(15);
//      int sum = IntStream.of(nums).sum();
        int sum = 0;

        for (int element: nums) {
            sum += element;
        }

        System.out.println(ArrayUtils.arrayToString(nums));
        System.out.println((double) sum / (double) nums.length);
    }
}
