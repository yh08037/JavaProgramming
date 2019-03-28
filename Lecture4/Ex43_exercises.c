#include <stdio.h>
#include <math.h>

double toRadians(double degree) {
    return degree / 180.0 * M_PI;
}

int main(void) {
    double a, b, c, d;

    a = atan(sin(toRadians(32)) * cos(toRadians(32)));

    b = pow(pow(M_E, 1.67) * pow(1.65, log(8)/log(20)), 1.0/4.0);

    c = log(pow(21, log(35)))/log(7);

    d = exp(sqrt(log(4))+sqrt(log(5)));

    printf("%lf %lf %lf %lf", a, b, c, d);

    return 0;
}
