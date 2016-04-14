package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/14/2016.
 */
public class e1HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill a number to convert in binary:");

        int inputInt = scanner.nextInt();

        System.out.println(Integer.toBinaryString(inputInt));

    }
}
