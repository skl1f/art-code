package week3.day2;

/**
 * Created by skl1f on 4/24/2016.
 * Stack example
 */
public class _03MethodCall {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
        System.out.println("Hello I'm a!");
    }

    private static void b() {
        c();
        System.out.println("Hello I'm b!");
    }

    private static void c() {
        System.out.println("Hello I'm c!");
    }
}
