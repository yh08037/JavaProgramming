import java.util.Scanner;

public class TwoTrianglesDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many lines? ");
        int num = scan.nextInt();

        int cnt = 1;

        for ( int i = 0; i < num/2+num%2; i++ ) {
            for ( int j = 0; j < i+1; j++ ) {
                System.out.print(cnt);
                cnt++;
                if ( cnt == 10 ) cnt = 1;
            }
            System.out.println();
        }
        for ( int i = 0; i < num/2; i++ ) {
            for ( int j = 0; j < i+num%2; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 0; j < num/2-i; j++ ) {
                System.out.print(cnt);
                cnt++;
                if ( cnt == 10 ) cnt = 1;
            }
            System.out.println();
        }
    }
}
