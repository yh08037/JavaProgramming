#include <stdio.h>
#include <string.h>

int main(void) {

    const int x = 100;
    const int y = 200;
    int sum;

    sum = x + y;

    printf("%d\n", sum);


    const char str_x[] = "100";
    const char str_y[] = "200";

    char str_sum[2014];
    strcpy(str_sum, str_x);
    strcat(str_sum, str_y);

    printf("%s\n", str_sum);

    return 0;
}
