#include <stdio.h>

int main (void)
{
    int x,y,small,big,n;
    printf("How many numbers do you want: ");
    scanf("%d",&y);
    for (x=1 ; x <= y ; x++)
    {
        printf("Enter a number: ");
        scanf("%d",&n);
        if (x==1)
        {
            big = n;
            small = n;
        }
       else
        {  
            if (n > big)
            {
                big = n;
            }
            if (n < small)
            {
                small = n;
            }
        }
    }
    printf ("%d is the largest \n" , big);
    printf ("%d is the smallest\n",small);
}