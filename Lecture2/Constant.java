import java.util.Scanner;

public class Constant {
	public static void main(String[] args) {
		final int x = 100;
		final int y = 200;
		int sum;
		
		sum = x + y;
		System.out.println(sum);
		
		final String str_x = "100";
		final String str_y = "200";
		String str_sum;
		
		str_sum = str_x + str_y;
		System.out.println(str_sum);
	}
}