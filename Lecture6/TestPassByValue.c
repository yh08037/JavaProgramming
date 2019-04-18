#include <stdio.h>

void swap(int, int);

int main(void){
    int num1 = 1;
    int num2 = 2;
    printf("Before invoking swap, num1 is %d and num2 is %d\n", num1, num2);
    swap(num1, num2);
    printf("After invoking swap, num1 is %d and num2 is %d\n", num1, num2);

    return 0;
}

void swap(int n1, int n2) {
    printf("\tBefore swapping, n1 is %d and n2 is %d\n", n1, n2);
    int temp = n1;
    n1 = n2;
    n2 = temp;
    printf("\tAfter swapping, n1 is %d and n2 is %d\n", n1, n2);
}
