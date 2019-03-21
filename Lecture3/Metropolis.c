#include <stdio.h>

int main(void) {
    int isCapital = 0, isMetropolis = 0;
    int citizen;
    int bourgeois;

    printf("Is the city capital? (capital:1 non-capital:0) ");
    scanf("%d", &isCapital);
    printf("Population? (in thousands) ");
    scanf("%d", &citizen);
    printf("Bourgeois? (in thousands) ");
    scanf("%d", &bourgeois);

    isMetropolis = (isCapital && citizen >= 1000) || (bourgeois >= 500);

    printf("Metropolis: %s\n", isMetropolis ? "true" : "false");

    return 0;
}
