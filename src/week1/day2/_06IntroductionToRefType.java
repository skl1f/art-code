package week1.day2;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _06IntroductionToRefType {
    public static void main(String[] args) {
        char o = 'O';
        char l = 'l';
        char e = 'e';
        char k = 'k';
        char s = 's';
        char i = 'i';

        System.out.println(Character.toString(o) + Character.toString(l) + Character.toString(e) +
                Character.toString(k) + Character.toString(s) + Character.toString(i) + Character.toString(i));

        String name = "Oleksii";
        String name1 = "Oleksii";
        System.out.println(name1);
        name = new String("Oleksii");

        System.out.println(name);
    }
}
