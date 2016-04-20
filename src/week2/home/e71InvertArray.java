package week2.home;

import utils.ArrayUtils;

/**
 * Created by skl1f on 4/20/2016.
 * Invert Arrays
 */
public class e71InvertArray {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.genArray(15);

        System.out.println(ArrayUtils.arrayToString(nums));

        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = tmp;
        }

        System.out.println(ArrayUtils.arrayToString(nums));

    }
}