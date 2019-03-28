import java.util.Scanner;

public class Ex45_CountingSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a line : ");
        String s = input.nextLine();

        int num_spaces = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' ) num_spaces++;
        }

        System.out.println( "Num of spaces : " + num_spaces );
    }
}
