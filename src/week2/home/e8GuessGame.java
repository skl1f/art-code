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
        while (guess != number && attempt < 5) {
            guess = scanner.nextInt();
            attempt++;
            System.out.println(guess < number ? "Number should be bigger ;)" :
                    "Number should be less ;)");
        }
        String str;
        switch (attempt) {
            case 1:
                str = "You Win! From first attempt. Lucky you!";
                break;
            case 2:
                str = "Not bad. you guessed from second attempt.";
                break;
            case 3:
            case 4:
                str = "You Win!";
                break;
            default:
                str = "Game Over";
        }
        System.out.println(str);
    }
}
