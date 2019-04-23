import java.util.Scanner;

public class SortedRandomDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            arr[0] = (int) (Math.random()*9) + 1;

            for (int i = 1; i < n; i++) {
                int num = (int) (Math.random()*9) + 1;
                int a = i - 1;
                while ((a >= 0) && (arr[a] < num)) {
                    arr[a + 1] = arr[a];
                    a--;
                }
                arr[a + 1] = num;
            }

            for (int v : arr) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

    }
}
