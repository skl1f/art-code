package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/12/2016.
 * Program which will calculate how many times numbers repeats.
 */

public class _29HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill your number:");
        String value  = scanner.nextLine();
        int counter = 0;

        for (char num: value.toCharArray()) {
            if (num % '5' == 0) {
                counter +=1;
            }
        }

        System.out.println("Number \"5\" repeats " + counter + " times");
    }
}
