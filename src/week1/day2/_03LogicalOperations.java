package week1.day2;

/**
 * Created by skl1f on 4/10/2016.
 */
public class _03LogicalOperations {
    public static void main(String[] args) {
//        boolen a and boolean b -> compare a with b
//        | OR if one of a or b -> true
//        & AND both should be true otherwise
        boolean a = true;
        boolean b = false;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("a OR b -> " + (a | b));
        System.out.println("a AND b -> " + (a & b));

        System.out.println("a XOR b -> " + (a ^ b));
        System.out.println("a XAND b -> " + (a ^ b));
    }
}

