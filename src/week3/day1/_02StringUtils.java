package week3.day1;

/**
 * Created by skl1f on 4/23/2016.
 */
public class _02StringUtils {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println(a == b);
        String name = "Jenja";
        String name2 = "Jenja";
        String name3 = new String("Jenja");

        boolean isEqual = name.equals(name3);

        System.out.println(isEqual);
        String hello = "Hello";

        String subHello = hello.substring(3);
        System.out.println(subHello);
    }
}
