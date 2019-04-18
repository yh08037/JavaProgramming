import java.util.Random;
import java.util.Scanner;

public class RandPerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n?  ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        boolean[] isGenerated = new boolean[n]; // default : false

        for ( int i = 0; i < n; i++ ) {
            while ( true ){
                int temp = random.nextInt(n);
                if ( !isGenerated[temp] ) {
                    arr[i] = temp + 1;
                    isGenerated[temp] = true;
                    break;
                }
            }
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
