#include <stdio.h>

int main(void) {

    int b;

    b = 1;
    printf("b = ");
    if ( b ) printf("true\n");
    else printf("false\n");

    b = ( 1 > 2 );
    printf("b = ");
    if ( b ) printf("true\n");
    else printf("false\n");

    return 0;
}
