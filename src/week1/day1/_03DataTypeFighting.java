package week1.day1;

/**
 * Created by skl1f on 4/9/2016.
 */
public class _03DataTypeFighting {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;

        int age = 26;
        // type casting
        byte newAge = (byte) age;

        int newInt = 257;
        byte newNewInt = (byte) newInt;
        System.out.println(newNewInt);
    }
}
