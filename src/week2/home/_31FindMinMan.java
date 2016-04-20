package week2.home;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by skl1f on 4/18/2016.
 * Find min and max of Integers in array
 */
public class _31FindMinMan {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.genArray(15);

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
        }

        Arrays.sort(nums);

        System.out.println(ArrayUtils.arrayToString(nums));
        System.out.println("Minimum => " + min + " || " + nums[0]);
        System.out.println("Maximum => " + max + " || " + nums[nums.length - 1]);
    }
}
