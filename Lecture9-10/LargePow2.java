import java.math.*;
import java.util.Scanner;

public class LargePow2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ? ");
        int n = scan.nextInt();
        System.out.println("2^" + n + " is \n" + pow2(n));
    }

    // public static BigInteger pow2(long n) {
    //     BigInteger b = BigInteger.ONE;
    //     for (long i = 0; i < n; i++) {
    //         b = b.multiply(BigInteger.valueOf(2));
    //     }
    //     return b;
    // }

    public static BigInteger pow2(long n) {
        if (n == 0) return BigInteger.ONE;
        return pow2(n-1).multiply(BigInteger.valueOf(2));
    }
}
