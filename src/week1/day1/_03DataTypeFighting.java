package week1.day1;

/**
 * Created by skl1f on 4/9/2016.
 */
public class _03DataTypeFighting {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;
        System.out.println("i = " + i);

        int age = 26;
        // type casting
        byte newAge = (byte) age;
        System.out.println("newAge = " + newAge);

        int newInt = 257;
        byte newNewInt = (byte) newInt;
        System.out.println(newNewInt);
    }
}
