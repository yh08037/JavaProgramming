import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		area = 3.14 * radius * radius;
		
		System.out.print("Area = ");
		System.out.println(area);
		System.out.printf("Area = %f\n", area);
		System.out.println("Area = " + area);
	}
}