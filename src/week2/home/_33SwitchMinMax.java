package week2.home;

import utils.ArrayUtils;

/**
 * Created by skl1f on 4/18/2016.
 * Program will switch min and max value of array
 */
public class _33SwitchMinMax {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.genArray(15);
        int min = nums[0], max = nums[0];
        int minId = 0, maxId = 0;

        System.out.println(ArrayUtils.arrayToString(nums));

        for (int i = 1; i < nums.length; i++) {
            minId = nums[i] < min ? i : minId;
            maxId = nums[i] > max ? i : maxId;
        }

        int tmp = nums[minId];
        nums[minId] = nums[maxId];
        nums[maxId] = tmp;

        System.out.println(ArrayUtils.arrayToString(nums));

    }
}
