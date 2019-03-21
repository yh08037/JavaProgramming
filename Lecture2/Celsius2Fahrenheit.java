import java.util.Scanner;

public class Celsius2Fahrenheit {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print( "Celsius : " );
		celsius = scan.nextDouble();
		
		fahrenheit = ( 9.0 / 5 ) * celsius + 32;

		System.out.println( celsius + " C == " + fahrenheit + " F");
	}
}
		