package week1.day1;

/**
 * Created by skl1f on 4/9/2016.
 */
public class _02DataTypes {
    public static void main(String[] args) {
        // <type> <name>; or <type><name> = <value>;
        int age = 26;
        byte b = 127;
        // should be with L or l
        long salary = 56_000_000_000L;
        // should be with F or f
        float ff = 0.15F;

        char letter = 'C';

        int letterInint = letter;

        System.out.println(age);
        System.out.println(b);
        System.out.println(salary);
        System.out.println(ff);
        System.out.println(letter);
        System.out.println(letterInint);
    }
}
