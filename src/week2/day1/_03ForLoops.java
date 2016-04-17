package week2.day1;

import java.util.Arrays;

/**
 * Created by skl1f on 4/16/2016.
 */
public class _03ForLoops {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4, 5, 6, 7};

        for (int start: nums) {
            System.out.println(start);
        }

        int numbers2[] = new int[15];

        for (int i = 0; i <= 14; i++) {
            numbers2[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers2));
    }
}
