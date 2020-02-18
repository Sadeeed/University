#include <stdio.h>
#define HHH 12


int bubble_sort(int sort[],int);

int main()
{
    int a[HHH]={11,10,9,8,7,6,5,4,3,2,1,0},i;
    //Print Unsorted Array
    printf("Array 1:[ ");
    for (i = 0 ; i < HHH ; i++)
    {
        printf("%d ",a[i]);
    }
    printf("] \n");

    //Sort Array
    bubble_sort(a,HHH);

    //Print Sorted Array
    printf("Array 2:[ ");
    for (i = 0 ; i < HHH ; i++)
    {
        printf("%d ",a[i]);
    }
    printf("] \n");

    return 0;
}

int bubble_sort(int sort[],int elem)
{
    int i , j , temp;
    for (i =1 ; i < elem ; ++i)
    {
        for (j = 0 ; j < elem-1 ; ++j)
        {
            if ( sort[ j ] > sort[ j + 1 ] )
            {
                temp = sort[ j ];
                sort[ j ] = sort[ j + 1 ];
                sort[ j + 1 ] = temp;
            }
        }
    } 
}