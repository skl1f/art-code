package week1.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/12/2016.
 * Program calculate and compare diameter of circle
 * and edge of square
 */

public class a15HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Please fill area of a circle:");
        int areaOfCircle = scanner.nextInt();

        System.out.println("Please fill area of a square:");
        int areaOfSquare = scanner.nextInt();

        double radiusOfCircle = Math.sqrt(areaOfCircle / pi);
        double edgeOfCube = Math.sqrt(areaOfSquare);

        if (2 * radiusOfCircle <= edgeOfCube) {
            System.out.println("Square is big enough.");
        } else {
            System.out.println("Square is not bit enough.");
        }
    }
}
