package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/14/2016.
 */
public class e4HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill a number to calculate fibonacci sequence:");

        int inputInt = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= inputInt ; i++) {
            a += b;
            b += a;
            System.out.print(a + " " + b + " ");
        }

    }
}
