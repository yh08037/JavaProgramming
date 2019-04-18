#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
    srand(time(NULL));
    printf("n?  ");
    int n; scanf("%d", &n);

    int* arr = (int*)malloc(sizeof(int)*n);

    int* isGenerated = (int*)malloc(sizeof(int)*n);
    for ( int i = 0; i < n; i++ ) {
        isGenerated[i] = 0;
    }

    for ( int i = 0; i < n; i++ ) {
        while ( 1 ){
            int temp = rand() % n;
            if ( !isGenerated[temp] ) {
                arr[i] = temp + 1;
                isGenerated[temp] = 1;
                break;
            }
        }
    }

    for (int i = 0; i < n; i++ ) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    free(arr);
    free(isGenerated);

    return 0;
}
