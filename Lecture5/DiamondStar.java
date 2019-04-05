import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many lines? ");
        int n = scan.nextInt();

        int num = n%2==0 ? n/2-1 : n/2;

        for ( int i = 0 ; i < num+1; i++) {
            for ( int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for ( int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = n/2 ; i > 0; i--) {
            for ( int j = 0; j < n/2-i+n%2; j++) {
                System.out.print(" ");
            }
            for ( int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
