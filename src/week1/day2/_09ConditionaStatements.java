package week1.day2;

import java.util.Scanner;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _09ConditionaStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill your age:");
        try {
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Too young");
            } else if (age > 60){
                System.out.println("Too old");
            } else {
                System.out.println("Adult");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Try again! Wrong input.");
        }
    }
}
