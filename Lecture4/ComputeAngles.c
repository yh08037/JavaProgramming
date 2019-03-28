#include <stdio.h>
#include <math.h>

double toDegrees(double rad) {
    return rad / M_PI * 180;
}

int main(void){

    printf("Enter three points : ");

    double x1, y1, x2, y2, x3, y3;
    scanf("%lf", &x1);   scanf("%lf", &y1);
    scanf("%lf", &x2);   scanf("%lf", &y2);
    scanf("%lf", &x3);   scanf("%lf", &y3);

    double a = sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
    double b = sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
    double c = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

    double A = toDegrees(acos((a*a - b*b - c*c) / (-2*b*c)));
    double B = toDegrees(acos((b*b - a*a - c*c) / (-2*a*c)));
    double C = toDegrees(acos((c*c - a*a - b*b) / (-2*a*b)));

    printf("The three angles are %lf %lf %lf ",
        round(A*100) / 100.0,
        round(B*100) / 100.0,
        round(C*100) / 100.0);

    return 0;
}
