package week1.home;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by skl1f on 4/12/2016.
 * Convert into two integer arrays and found a sum of elements.
 */

public class a14HomeTask {
    public static void main(String[] args) {
        System.out.println("Please fill a number to check if it's \"lucky-number\"");
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        char[] charNumbers = numbers.toCharArray();


        int[] numbersArray = new int[charNumbers.length];

        for (int x = 0; x < numbers.length(); x++) {
            numbersArray[x] = Character.getNumericValue(charNumbers[x]);
            System.out.println(numbersArray[x]);
        }

        boolean lucky = false;
        int[] leftHalf = Arrays.copyOfRange(numbersArray, 0, numbersArray.length/2);
        int[] rightHalf = Arrays.copyOfRange(numbersArray, numbersArray.length/2, numbersArray.length);
        int sumLeftHalf = IntStream.of(leftHalf).sum();
        int sumRightHalf = IntStream.of(rightHalf).sum();

        if (sumLeftHalf == sumRightHalf) {
            lucky = true;
        }

        System.out.println("Is it lucky number? " + lucky);
    }
}
