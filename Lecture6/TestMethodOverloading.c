#include <stdio.h>

int max_int(int, int);
double max_double(double, double);
double max_double_3(double, double, double);

int main(void) {

    printf("max(3, 4) = %d\n", max_int(3, 4));
    printf("max(3.0, 5.4) = %lf\n", max_double(3.0, 5.4));
    printf("max(3.0, 5.4, 10.14) = %lf\n", max_double_3(3.0, 5.4, 10.14));

    return 0;
}

int max_int(int num1, int num2) {
    if ( num1 > num2 ) return num1;
    else return num2;
}

double max_double(double num1, double num2) {
    if ( num1 > num2 ) return num1;
    else return num2;
}

double max_double_3(double num1, double num2, double num3) {
    return max_double(max_double(num1, num2), num3);
}
