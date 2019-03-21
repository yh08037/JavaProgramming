#include <stdio.h>

int main(void) {

    double radius;
    double area;

    printf("Enter the radius: ");
    scanf("%lf", &radius);

    area = 3.14 * radius * radius;

    printf("Area = ");
    printf("%lf\n", area);
    printf("Area = %f\n", area);
    printf("Area = %lf", area);

    return 0;
}
