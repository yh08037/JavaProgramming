#include <stdio.h>
#define MAX_LEN 256

int main(void) {

    char buffer[MAX_LEN], *result;

    printf("Enter a line : ");
    result = fgets(buffer, MAX_LEN, stdin);

    int num_spaces = 0;

    for (int i = 0; result[i] != '\0'; i++) {
        if ( result[i] == ' ' ) num_spaces++;
    }

    printf("Number of spaces : %d\n", num_spaces);

    return 0;
}
