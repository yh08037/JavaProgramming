import java.util.Scanner;

public class Factorial10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, tmp, tmp2, num10 = 0;
        long fac = 1L;
        long fac2;

        System.out.print("n? ");
        num = scan.nextInt();
        tmp = 1;
        tmp2 = tmp;

        while (tmp <= num) {
            fac2 = fac;
            fac *= tmp;
            if (fac2 != fac / tmp) {
                System.out.println("Overflowed at " + tmp + "!");
                fac = fac2;
                break;
            }
            tmp2 = tmp;
            tmp++;
            while ( fac % 10 == 0 ) {
                num10++;
                fac /= 10;
            }
        }

        System.out.print(tmp2 + "! = " + fac);
        for ( int i = 0; i < num10; i++ ) System.out.print("0");
        System.out.println(" (fac = " + fac + ", num10 = " + num10 + ")");

    }
}
