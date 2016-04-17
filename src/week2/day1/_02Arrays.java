package week2.day1;

import utils.ArrayUtils;

/**
 * Created by skl1f on 4/16/2016.
 */
public class _02Arrays {
    public static void main(String[] args) {
        String[] names = new String[8];

        names[0] = "Name0";
        names[1] = "Name1";
        names[2] = "Name2";
        names[3] = "Name3";
        names[4] = "Name4";
        names[5] = "Name5";
        names[6] = "Name6";
        names[7] = "Name7";

        System.out.println(ArrayUtils.arrayToString(names));

    }
}
