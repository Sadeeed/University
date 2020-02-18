/*A program to print prime numbers*/

#include <stdio.h>

int main(void)
{
    int x , y,prime=0,z;
    for (x=2;x<=100;x++)
    {
        prime = 0;
        for (y=2 ; y <= x/2 ; y++)
        {
            if (x % y == 0)
            {
            prime = 1;
            }
        }
        if (prime  == 0)
        {
            printf ("%d \n",x);
        }
    }



    return 0;
}
