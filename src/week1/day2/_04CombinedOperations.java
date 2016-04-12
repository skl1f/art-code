package week1.day2;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _04CombinedOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int c = 0;
        int d = -56;

        boolean answer1 = a > b;
        boolean answer2 = c != d;

        System.out.println(answer1 | answer2);
    }
}
