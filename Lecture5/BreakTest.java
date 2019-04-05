import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while ( true ) {
            int score;
            System.out.print("Your score? (negative number when done) ");
            score = sc.nextInt();
            if ( score < 0 ) {
                break;
            }
            total += score;
            count++;
        }
        System.out.printf("Average score is %.2f\n",
            (double)total/(double)count);
    }
}
