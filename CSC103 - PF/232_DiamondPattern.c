#include <stdio.h>

int upperPiece(int n){
    int x=1;
    int z,m1,m2;
    for(int i = 1; i <= n; i++){
        for(int j = n; j > i; j--){
            printf(" ");
        }
        for(int k = 1; k <= i; k++){
            if (x >= 10)
            {
                printf("%d",(x++)%10);
            }
            else
            {
                printf("%d", x++);   
            }
        }
        for(int l = i - 1; l >= 1; l--){
            z=x-2;
            x=x-1;
            if (z >= 10)
            {
                printf("%d",z%10);
            }
            else
            {
                printf("%d", z);
            }
        }
        printf("\n");
    }
}

int lowerPiece(int n){
    int x=n-1;
    int z;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            printf(" ");
        }
        for(int k = 1; k <= n - i; k++){
            if (x >= 10)
            {
                printf("%d",(x++)%10);
            }
            else
            {
                printf("%d", x++);   
            }
        }
        for(int l = n - i - 1; l >= 1; l--){
            z=x-2;
            x=x-1;
            if (z >= 10)
            {
                printf("%d",z%10);
            }
            else
            {
                printf("%d", z);
            }
        }
        x--;
        x--;
        printf("\n");
    }
}

int main(){
    int n;

    do 
    {
        printf("Enter number of rows: ");
        scanf("%d", &n);
    } while (n <= 0 && n >= 10);

    upperPiece(n);
    lowerPiece(n);

    return 0;
}