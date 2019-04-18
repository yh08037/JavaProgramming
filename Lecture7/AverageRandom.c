#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
    srand(time(NULL));

    int n;
    printf("n?  ");
    scanf("%d", &n);

    int* arr = (int*)malloc(sizeof(int)*n);

    int sum = 0;
    for ( int i = 0; i < n; i++ ) {
        arr[i] = rand() % 9 + 1;
        printf("%d ", arr[i]);
        sum += arr[i];
    }
    printf("\n");

    double average = (double) sum / n;
    printf("Average = %lf\n", average);

    int cnt = 0;
    for ( int i = 0; i < n; i++ ) {
        if ( arr[i] > average ) {
            cnt++;
        }
    }

    printf("Number of values above the average = %d\n", cnt);

    free(arr);
    return 0;
}
