package week1.day2;

import java.util.Scanner;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _07Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill you name:");
        String name = scanner.nextLine();
        System.out.println("Please fill you age:");
        try {
            int age = scanner.nextInt();
            System.out.println(name + " " + age + " years old");
        } catch (java.util.InputMismatchException e)  {
            System.out.println("Wrong input");
        }
    }
}
