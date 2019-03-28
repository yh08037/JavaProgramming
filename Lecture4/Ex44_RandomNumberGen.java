public class Ex44_RandomNumberGen {
    public static void main(String[] args) {

        boolean flag_minus18 = false;
        boolean flag_9 = false;

        int randomNumber, cnt = 1;
        int first_minus18 = 0, first_9 = 0;

        while ( !(flag_minus18 && flag_9) ) {
            randomNumber = (int) (Math.random() * 28 ) - 18;

            if ( randomNumber == -18 ) {
                if ( !flag_minus18 ) first_minus18 = cnt;
                System.out.println( ">> Found -18 at " + cnt);
                flag_minus18 = true;
            } else if( randomNumber == 9 ) {
                if ( !flag_9 ) first_9 = cnt;
                System.out.println( ">> Found 9 at " + cnt);
                flag_9 = true;
            }

            cnt++;
        }

        System.out.println( "The first appearance of -18 was at " + first_minus18 );
        System.out.println( "The first appearance of 9 was at " + first_9 );

    }
}
