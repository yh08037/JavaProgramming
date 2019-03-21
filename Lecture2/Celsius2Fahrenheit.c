#include <stdio.h>

int main(void) {
	
	double celsius, fahrenheit;
	
	printf("Celsius : ");
	scanf("%lf", &celsius);
	
	fahrenheit = ( 9.0 / 5 ) * celsius + 32;
	
	printf("%lf C == %lf F", celsius, fahrenheit);
	
	return 0;

}
	