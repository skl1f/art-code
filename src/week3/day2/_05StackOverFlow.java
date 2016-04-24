package week3.day2;

/**
 * Created by skl1f on 4/24/2016.
 * recursion example
 */
public class _05StackOverFlow {
    public static void main(String[] args) {
        a(1);
    }

    private static void a(int q) {
        System.out.println(q);
        a(q + 1);
    }
}