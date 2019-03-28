#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {

    srand(time(NULL));

    int flag_minus18 = 0;
    int flag_9 = 0;

    int randomNumber, cnt = 1;
    int first_minus18 = 0, first_9 = 0;

    while ( !(flag_minus18 && flag_9) ) {
        randomNumber = rand() % 28 - 18;

        if ( randomNumber == -18 ) {
            if ( !flag_minus18 ) first_minus18 = cnt;
            printf( ">> Found -18 at %d\n", cnt);
            flag_minus18 = 1;
        } else if( randomNumber == 9 ) {
            if ( !flag_9 ) first_9 = cnt;
            printf( ">> Found 9 at %d\n", cnt);
            flag_9 = 1;
        }

        cnt++;
    }

    printf( "The first appearance of -18 was at %d\n", first_minus18 );
    printf( "The first appearance of 9 was at %d\n", first_9 );

    return 0;
}
