package week2.day1;

/**
 * Created by skl1f on 4/16/2016.
 */

public class _01TernaryOperator {
    public static void main(String[] args) {
        int a = 5;

        if (a > 3) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

        String answer = (a > 3) ? "Yes!" : "No!";
        System.out.println(answer);
    }
}
