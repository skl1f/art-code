package week2.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/20/2016.
 * Guessing game.
 */
public class e8GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 25, max = 125, guess = 0, attempt = 0;
        int number = (int) (min + Math.random() * (max - min));

        System.out.printf("Please try guess number between %1$s and %2$s:", min, max);
        while (guess != number && attempt <= 6) {
            guess = scanner.nextInt();
            attempt++;
            if (guess < number) {
                System.out.println("Try again! Number should be bigger ;)");
            } else if (guess > number) {
                System.out.println("Try again! Number should be less ;)");
            }
        }
        if (guess == number) {
            System.out.println("You win!");
        } else {
            System.out.println("Game Over");
        }
    }
}
