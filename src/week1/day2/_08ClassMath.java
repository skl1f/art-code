package week1.day2;

import java.util.Random;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _08ClassMath {
    public static void main(String[] args) {
        int a = 12;
        double powA = Math.pow(a, 3);
        double sqrtA = Math.sqrt(powA);
        double rnd = Math.random();
        Random rnd1 = new Random();
        double rnd2 = rnd1.nextDouble()* 100;

        System.out.println((int) powA);
        System.out.println((int) sqrtA);
        System.out.println(rnd);
        System.out.println(rnd2);
    }
}