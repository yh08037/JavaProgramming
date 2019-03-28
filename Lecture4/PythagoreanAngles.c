#include <stdio.h>
#include <math.h>

double toDegrees(double rad) {
    return rad / M_PI * 180;
}

int main(void) {
    double AB = 4;
    double AC = 3;

    double alpha = atan(AC / AB);
    double beta = atan(AB / AC);

    printf("alpha = %.2lf radians, %.2lf degrees\n",
        round(alpha*100)/100.0, round(toDegrees(alpha)*100)/100.0);
    printf("beta = %.2lf radians, %.2lf degrees\n",
        round(beta*100)/100.0, round(toDegrees(beta)*10)/10.0);

    return 0;
}
