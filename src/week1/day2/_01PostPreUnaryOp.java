package week1.day2;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _01PostPreUnaryOp {
    public static void main(String[] args) {
        int a = 25;
        // take a; b -> a; a = a + 1;
        int b = a++;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int c = 25;
        int d = ++c;
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
