import java.util.Arrays;
import java.util.Collections;


public class Test {
    public static void main(String[] args) {
        Complex[] arr = { new Complex(1, -2), new Complex(9, 4), new Complex(3, 2),
            new Complex(2, -2), new Complex(0, 1), new Complex(-4, -3) };

        for (Complex c : arr) System.out.print(c.toString() + " ");
        System.out.println();

        Arrays.sort(arr);

        for (Complex c : arr) System.out.print(c.toString() + " ");
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());

        for (Complex c : arr) System.out.print(c.toString() + " ");
        System.out.println();


    }
}
