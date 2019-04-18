#include <stdio.h>
#include <stdlib.h>
#include <time.h>

char getRandomCharacter(char, char);
char getRandomLowerCaseLetter();
char getRandomUpperCaseLetter();
char getRandomDigitCharacter();
char getRandomCharacter_1();

int main(void) {
    srand(time(NULL));

    printf("Length of the variable? ");
    int length; scanf("%d", &length);

    int num = rand() % 63;
    if ( num < 26 )
        printf("%c", getRandomLowerCaseLetter());
    else if ( num < 52 )
        printf("%c", getRandomUpperCaseLetter());
    else if ( num < 62 );
    else printf("_");

    for ( int i = 0; i < length-1; i++ ){
        num = rand() % 63;
        if ( num < 26 )
            printf("%c", getRandomLowerCaseLetter());
        else if ( num < 52 )
            printf("%c", getRandomUpperCaseLetter());
        else if ( num < 62 )
            printf("%c", getRandomDigitCharacter());
        else printf("_");
    }

    printf("\n");

    return 0;
}

char getRandomCharacter(char ch1, char ch2) {
    return ch1 + rand() % (ch2 - ch1 + 1);
}

char getRandomLowerCaseLetter() {
    return getRandomCharacter('a', 'z');
}

char getRandomUpperCaseLetter() {
    return getRandomCharacter('A', 'Z');
}

char getRandomDigitCharacter() {
    return getRandomCharacter('0', '9');
}

char getRandomCharacter_1() {
    return getRandomCharacter(0, 127);
}
