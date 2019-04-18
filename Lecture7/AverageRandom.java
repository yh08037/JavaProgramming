import java.util.Scanner;
import java.util.Random;

public class AverageRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n?  ");
        int n = scan.nextInt();

        Random random = new Random();
        int[] arr = new int[n];

        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            arr[i] = random.nextInt(9) + 1;
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();

        double average = (double) sum / n;
        System.out.println("Average = " + average);

        int cnt = 0;
        for ( int i = 0; i < n; i++ ) {
            if ( arr[i] > average ) {
                cnt++;
            }
        }

        System.out.println("Number of values above the average = " + cnt);
    }

}
