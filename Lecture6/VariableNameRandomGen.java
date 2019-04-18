import java.util.Scanner;
import java.util.Random;

public class VariableNameRandomGen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Length of the variable? ");
        int length = scan.nextInt();

        int num = rand.nextInt(64);
        if ( num < 26 )
            System.out.print(RandomCharacter.getRandomLowerCaseLetter());
        else if ( num < 52 )
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
        else if ( num < 62 );
        else if ( num == 62 ) System.out.print('_');
        else System.out.print('$');

        for ( int i = 0; i < length-1; i++ ){
            num = rand.nextInt(64);
            if ( num < 26 )
                System.out.print(RandomCharacter.getRandomLowerCaseLetter());
            else if ( num < 52 )
                System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            else if ( num < 62 )
                System.out.print(RandomCharacter.getRandomDigitCharacter());
            else if ( num == 62 ) System.out.print('_');
            else System.out.print('$');
        }

        System.out.println();
    }
}
