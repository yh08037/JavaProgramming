#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
    srand(time(NULL));
    int n, isFirst = 1;

    while ( 1 ) {
        if (isFirst) {
            printf("n?  ");
            isFirst = 0;
        } else {
            printf("Input?  ");
        }

        scanf("%d", &n);

        if (n <= 0) break;

        int* arr = (int*)malloc(sizeof(int)*n);
        arr[0] = rand() % 9 + 1;

        for (int i = 1; i < n; i++) {
            int num = rand() % 9 + 1;
            int aux = i - 1;
            while ((aux >= 0) && (arr[aux] > num)) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = num;
        }

        for (int i = 0; i < n; i++ ) {
            printf("%d ", arr[i]);
        }
        printf("\n");

        free(arr);
    }

    return 0;
}
