package week2.day1;

import static java.lang.Thread.sleep;

/**
 * Created by skl1f on 4/16/2016.
 * Studying while loops.
 */
public class _04WhileLoops {
    public static void main(String[] args) throws InterruptedException {
        int accounts = 2000;
        int years = 0;

        while (accounts < 100000) {
            sleep(1);
            years++;
            accounts += 20000;
            System.out.println("Balance " + accounts);
            System.out.println("Years passed " + years);
        }
    }
}
