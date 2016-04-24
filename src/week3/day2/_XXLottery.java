package week3.day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skl1f on 4/24/2016.
 */

public class _XXLottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateLottery();
        int[] lotteryTicket = createTicket();
        Arrays.sort(lotteryNumbers);
        Arrays.sort(lotteryTicket);
        System.out.printf("Lottery number: %1s \n", Arrays.toString(lotteryNumbers));
        System.out.printf("Lottery tickets: %1s \n", Arrays.toString(lotteryTicket));
        int guessedNumbers = compareNumbers(lotteryNumbers, lotteryTicket);

        printCongrats(guessedNumbers);

    }

    private static void printCongrats(int guessedNumbers) {
        System.out.printf("You guessed %1s numbers", guessedNumbers);

    }

    private static int compareNumbers(int[] lotteryNumbers, int[] lotteryTicket) {
        int guessed = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == lotteryTicket[i]){
                guessed++;
             }
        }
        return guessed;
    }

    private static int[] createTicket() {
        int[] ticket = new int[6];
        System.out.println("Please fill lottery numbers. They should be uniq.");
        ticket = inputUniqNumber(ticket);
        return ticket;
    }

    private static int[] inputUniqNumber(int[] ticket) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ticket.length; i++) {
            while (true) {
                System.out.printf("Please fill number %1s:", i + 1);
                int input = scanner.nextInt();
                if (!hasNumber(input, ticket)) {
                    ticket[i] = input;
                    break;
                } else {
                    System.out.println("Ticker already has this number. Try Again!");
                }
            }
        }
        return ticket;
    }

    private static int[] generateLottery() {
        int[] lotteryNumbers = new int[6];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = genNumber(lotteryNumbers);
        }
        return lotteryNumbers;
    }

    private static int genNumber(int[] array) {
        int min = 1, max = 43, random;
        while (true) {
            random = min + (int) (Math.random() * (max - min));
            if (!hasNumber(random, array)) {
                break;
            }
        }
        return random;
    }

    private static boolean hasNumber(int random, int[] array) {
        boolean hasNumber = false;
        for (int n : array) {
            if (n == random) {
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }

}
