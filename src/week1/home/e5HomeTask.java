package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/14/2016.
 */
public class e5HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill a number to check if it's a fibonacci number:");

        int inputInt = scanner.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= inputInt ; i++) {
            if ((a += b) == inputInt) {
                System.out.println(2+i);
                break;
            } else if ((b += a) == inputInt) {
                System.out.println(3+i);
                break;
            } else if (a > inputInt | b > inputInt) {
                System.out.println(-1);
                break;
            }
        }


    }
}
