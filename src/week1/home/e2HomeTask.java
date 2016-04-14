package week1.home;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by skl1f on 4/14/2016.
 */
public class e2HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill a number to calculate factorial:");

        BigInteger inputInt =  BigInteger.valueOf(scanner.nextInt());

        BigInteger factorial = BigInteger.valueOf(1);

        for (BigInteger x = BigInteger.valueOf(2) ; x.compareTo(inputInt) == -1 | x.equals(inputInt); x = x.add(BigInteger.valueOf(1))) {
            factorial = factorial.multiply(x);
        }

        System.out.println(inputInt + "! = " + factorial);
    }
}
