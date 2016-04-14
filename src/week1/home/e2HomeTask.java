package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/14/2016.
 */
public class e2HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill a number to calculate factorial:");

        int inputInt = scanner.nextInt();
        long facrotial = 1;

        for (int x = 2 ; x <= inputInt; x++) {
            facrotial = facrotial * x;
        }

        System.out.println(inputInt + "! = " + facrotial);
    }
}
