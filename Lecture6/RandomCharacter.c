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
    const int NUMBER_OF_CHARS = 175;
    const int CHARS_PER_LINE = 25;

    for ( int i = 0; i < NUMBER_OF_CHARS; i++ ) {
        char ch = getRandomLowerCaseLetter();
        if ( (i + 1) % CHARS_PER_LINE == 0 ) printf("%c\n", ch);
        else printf("%c", ch);
    }

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
