import java.util.Random;
import java.util.Scanner;

public class SortedRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFirst = true;

        while ( true ) {
            if (isFirst) {
                System.out.print("n?  ");
                isFirst = false;
            } else {
                System.out.print("Input?  ");
            }

            int n = scanner.nextInt();

            if (n <= 0) break;

            int[] arr = new int[n];
            arr[0] = random.nextInt(9) + 1;

            for (int i = 1; i < n; i++) {
                int num = random.nextInt(9) + 1;
                int aux = i - 1;
                while ((aux >= 0) && (arr[aux] > num)) {
                    arr[aux + 1] = arr[aux];
                    aux--;
                }
                arr[aux + 1] = num;
            }

            for (int v : arr) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

    }
}
