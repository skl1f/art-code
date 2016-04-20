package week2.home;

import java.util.Scanner;

/**
 * Created by skl1f on 4/20/2016.
 * Guessing game.
 */
public class e8GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 25;
        int max = 125;

        int number = (int) (min + Math.random() * (max - min));
        System.out.println("Secret Number " + number);
        int guess;

        int attempt = 1;

        while (attempt <= 5){
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("You Win!");
                return;
            } else if (guess < number) {
                System.out.println("Try again! Number should be bigger ;)");
                attempt++;
            } else if (guess > number) {
                System.out.println("Try again! Number should be less ;)");
                attempt++;
            }
        }

    }
}
