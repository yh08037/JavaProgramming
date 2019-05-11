/* 김도훈 2018115809 */

import java.util.Scanner;
import java.util.Random;

public class ApproximatePISphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many samples to generate? ");
        int N_a = scan.nextInt();

        Random rand = new Random(N_a);

        int N_s = 0;

        for ( int i = 0; i < N_a; i++ ) {
            double x = 2 * rand.nextDouble() - 1;
            double y = 2 * rand.nextDouble() - 1;
            double z = 2 * rand.nextDouble() - 1;

            if ( x*x + y*y + z*z <= 1 ) N_s++;
        }

        double pi = 6 * (double) N_s /  N_a;
        double err = Math.abs(Math.PI - pi) / Math.PI;

        System.out.printf("pi from %d samples = %.7f, error = %.3e\n", N_a, pi, err);
    }
}