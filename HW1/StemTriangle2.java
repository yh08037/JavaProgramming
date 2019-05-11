/* 김도훈 2018115809 */

import java.util.Scanner;

public class StemTriangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Scale? (int) ");
        int N = scan.nextInt();

        int range = 4 * N + 1;
        int[] y = new int[range];

        int plt = N;
        for (int i = 0; i < 2*N; i++) y[i] = plt--;
        for (int i = 2*N; i <= 4*N; i++) y[i] = plt++;

        for (int i = N; i >= -N ; i--) {
            System.out.printf("%+3d  ", i);
            if (i == 0) {
                for (int j = 0; j < range; j++) {
                    if (y[j] == 0) System.out.print("O");
                    else System.out.print("-");
                }
            } else {
                for (int j = 0; j < range; j++) {
                    if (i > 0 ? y[j] < i : y[j] > i) System.out.print(" ");
                    else if (y[j] == i) System.out.print("O");
                    else System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
