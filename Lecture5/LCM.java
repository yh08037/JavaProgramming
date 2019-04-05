
public class LCM {

    public static void main(String[] args) {
        int x, y, r;

        System.out.print("    |");
        for ( int i = 20; i < 30; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();

        System.out.println("----+--------------------------------------------------");

        for ( int i = 10; i < 20; i++ ) {
            System.out.printf("%4d|", i);
            for ( int j = 20; j < 30; j++ ) {
                System.out.printf("%5d", lcm(i, j));
            }
            System.out.println();
        }

    }

    static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    static int gcd(int x, int y) {
        int r;
        if ( x < y ) {
            r = x; x = y; y = r;
        }
        while ( y != 0 ) {
            r = x % y;
            x = y;
            y = r;
        }

        return x;
    }

}
