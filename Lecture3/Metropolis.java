import java.util.Scanner;

public class Metropolis {
  public static void main(String[] args) {
    boolean isCapital, isMetropolis;
    int citizen;
    int bourgeois;

    Scanner sc = new Scanner(System.in);
    System.out.print("Is the city capital? (capital:1 non-capital:0) ");
    isCapital = (sc.nextInt() == 1);
    System.out.print("Population? (in thousands) ");
    citizen = sc.nextInt();
    System.out.print("Bourgeois? (in thousands) ");
    bourgeois = sc.nextInt();

    isMetropolis = (isCapital && citizen >= 1000) || (bourgeois >= 500);

    System.out.println("Metropolis: " + isMetropolis);
  }
}
